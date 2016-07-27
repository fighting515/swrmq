package com.smartwasser.swrmq.mybatis.interceptor;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.util.Properties;

import org.apache.ibatis.executor.statement.RoutingStatementHandler;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>SchemaInterceptor</p>
 * <p>根据当前用户指定对应的数据库，实现多租户的数据隔离</p>
 * <p>从ThreadLocal中找到当前用户对应的数据库schema，在每条sql执行前，添加mycat的注解，如/*!mycat: schema = zxjc *\/,mycat会根据注解，将SQL路由到指定的数据库schema下执行</p>
 * <p>@author chenhao</p>
 * <p>2016年5月10日</p>
 */
@Intercepts({@Signature(type=StatementHandler.class,method="prepare",args={Connection.class})})  
public class SchemaInterceptor implements Interceptor {
	
	private static final Logger log = LoggerFactory.getLogger(SchemaInterceptor.class);
	private Properties properties;

	@Override
	public Object intercept(Invocation invocation) throws Throwable {
		
		//拦截改造mybatis将要提交的sql
		if(invocation.getTarget() instanceof RoutingStatementHandler){
			RoutingStatementHandler rsh = (RoutingStatementHandler)invocation.getTarget();
			BoundSql boundSql = rsh.getBoundSql();
			String sql = boundSql.getSql();
			try{
				String schema = properties.getProperty("schema");
				if(schema != null && !schema.isEmpty()){
					//给每个SQL添加mycat注释，指定该SQL执行的schema
					String newSql = "/*!mycat: schema = "+schema+" */"+sql;
					
					//利用反射修改boundsql的sql属性值
					Field field = boundSql.getClass().getDeclaredField("sql");
					field.setAccessible(true);
					field.set(boundSql, newSql);
				}
			}catch(Exception e){
				log.error("SQL语句拼接schema错误："+e);
			}
		}
		
		return invocation.proceed();
	}

	@Override
	public Object plugin(Object target) {
		return Plugin.wrap(target, this);  
	}

	@Override
	public void setProperties(Properties properties) {
		this.properties = properties;  
	}

	public Properties getProperties() {
		return properties;
	}

}
