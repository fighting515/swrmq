package com.smartwasser.swrmq.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import com.smartwasser.swrmq.model.DataSource;
import com.smartwasser.swrmq.model.DataSourceExample;

public interface RmqDataSourceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_source
     *
     * @mbggenerated Wed Jul 20 10:24:01 CST 2016
     */
    int countByExample(DataSourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_source
     *
     * @mbggenerated Wed Jul 20 10:24:01 CST 2016
     */
    int deleteByExample(DataSourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_source
     *
     * @mbggenerated Wed Jul 20 10:24:01 CST 2016
     */
    @Insert({
        "insert into data_source (id, schema_name, ",
        "fk_system_id, run_state, ",
        "last_run_time, use_state, ",
        "create_time, creator, ",
        "update_time, remark, ",
        "del_flag)",
        "values (#{id,jdbcType=VARCHAR}, #{schemaName,jdbcType=VARCHAR}, ",
        "#{fkSystemId,jdbcType=VARCHAR}, #{runState,jdbcType=VARCHAR}, ",
        "#{lastRunTime,jdbcType=TIMESTAMP}, #{useState,jdbcType=VARCHAR}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{creator,jdbcType=VARCHAR}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{remark,jdbcType=VARCHAR}, ",
        "#{delFlag,jdbcType=VARCHAR})"
    })
    int insert(DataSource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_source
     *
     * @mbggenerated Wed Jul 20 10:24:01 CST 2016
     */
    int insertSelective(DataSource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_source
     *
     * @mbggenerated Wed Jul 20 10:24:01 CST 2016
     */
    List<DataSource> selectByExample(DataSourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_source
     *
     * @mbggenerated Wed Jul 20 10:24:01 CST 2016
     */
    int updateByExampleSelective(@Param("record") DataSource record, @Param("example") DataSourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_source
     *
     * @mbggenerated Wed Jul 20 10:24:01 CST 2016
     */
    int updateByExample(@Param("record") DataSource record, @Param("example") DataSourceExample example);
}