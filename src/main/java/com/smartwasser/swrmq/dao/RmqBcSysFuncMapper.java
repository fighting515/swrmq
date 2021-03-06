package com.smartwasser.swrmq.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.smartwasser.swrmq.model.BcSysFunc;
import com.smartwasser.swrmq.model.BcSysFuncExample;

public interface RmqBcSysFuncMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bc_sys_func
     *
     * @mbggenerated Fri Jul 22 17:56:11 CST 2016
     */
    int countByExample(BcSysFuncExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bc_sys_func
     *
     * @mbggenerated Fri Jul 22 17:56:11 CST 2016
     */
    int deleteByExample(BcSysFuncExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bc_sys_func
     *
     * @mbggenerated Fri Jul 22 17:56:11 CST 2016
     */
    @Delete({
        "delete from bc_sys_func",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bc_sys_func
     *
     * @mbggenerated Fri Jul 22 17:56:11 CST 2016
     */
    @Insert({
        "insert into bc_sys_func (ID, APPID, ",
        "PARENTID, FUNCNAMECH, ",
        "FUNCNAMEEN, FUNCURL, ",
        "FUNCDESC, FUNCCODE, ",
        "PRIORITY, ISMENU, ",
        "CREATETIME, CHFUNCMID, ",
        "isapp)",
        "values (#{id,jdbcType=VARCHAR}, #{appid,jdbcType=VARCHAR}, ",
        "#{parentid,jdbcType=VARCHAR}, #{funcnamech,jdbcType=VARCHAR}, ",
        "#{funcnameen,jdbcType=VARCHAR}, #{funcurl,jdbcType=VARCHAR}, ",
        "#{funcdesc,jdbcType=VARCHAR}, #{funccode,jdbcType=VARCHAR}, ",
        "#{priority,jdbcType=DECIMAL}, #{ismenu,jdbcType=DECIMAL}, ",
        "#{createtime,jdbcType=TIMESTAMP}, #{chfuncmid,jdbcType=DECIMAL}, ",
        "#{isapp,jdbcType=VARCHAR})"
    })
    int insert(BcSysFunc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bc_sys_func
     *
     * @mbggenerated Fri Jul 22 17:56:11 CST 2016
     */
    int insertSelective(BcSysFunc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bc_sys_func
     *
     * @mbggenerated Fri Jul 22 17:56:11 CST 2016
     */
    List<BcSysFunc> selectByExample(BcSysFuncExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bc_sys_func
     *
     * @mbggenerated Fri Jul 22 17:56:11 CST 2016
     */
    @Select({
        "select",
        "ID, APPID, PARENTID, FUNCNAMECH, FUNCNAMEEN, FUNCURL, FUNCDESC, FUNCCODE, PRIORITY, ",
        "ISMENU, CREATETIME, CHFUNCMID, isapp",
        "from bc_sys_func",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    @ResultMap("BaseResultMap")
    BcSysFunc selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bc_sys_func
     *
     * @mbggenerated Fri Jul 22 17:56:11 CST 2016
     */
    int updateByExampleSelective(@Param("record") BcSysFunc record, @Param("example") BcSysFuncExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bc_sys_func
     *
     * @mbggenerated Fri Jul 22 17:56:11 CST 2016
     */
    int updateByExample(@Param("record") BcSysFunc record, @Param("example") BcSysFuncExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bc_sys_func
     *
     * @mbggenerated Fri Jul 22 17:56:11 CST 2016
     */
    int updateByPrimaryKeySelective(BcSysFunc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bc_sys_func
     *
     * @mbggenerated Fri Jul 22 17:56:11 CST 2016
     */
    @Update({
        "update bc_sys_func",
        "set APPID = #{appid,jdbcType=VARCHAR},",
          "PARENTID = #{parentid,jdbcType=VARCHAR},",
          "FUNCNAMECH = #{funcnamech,jdbcType=VARCHAR},",
          "FUNCNAMEEN = #{funcnameen,jdbcType=VARCHAR},",
          "FUNCURL = #{funcurl,jdbcType=VARCHAR},",
          "FUNCDESC = #{funcdesc,jdbcType=VARCHAR},",
          "FUNCCODE = #{funccode,jdbcType=VARCHAR},",
          "PRIORITY = #{priority,jdbcType=DECIMAL},",
          "ISMENU = #{ismenu,jdbcType=DECIMAL},",
          "CREATETIME = #{createtime,jdbcType=TIMESTAMP},",
          "CHFUNCMID = #{chfuncmid,jdbcType=DECIMAL},",
          "isapp = #{isapp,jdbcType=VARCHAR}",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(BcSysFunc record);
}