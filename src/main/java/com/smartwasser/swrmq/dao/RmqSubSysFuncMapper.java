package com.smartwasser.swrmq.dao;

import com.smartwasser.swrmq.model.SubSysFunc;
import com.smartwasser.swrmq.model.SubSysFuncExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface RmqSubSysFuncMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sub_sys_func
     *
     * @mbggenerated Fri Jul 22 18:04:39 CST 2016
     */
    int countByExample(SubSysFuncExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sub_sys_func
     *
     * @mbggenerated Fri Jul 22 18:04:39 CST 2016
     */
    int deleteByExample(SubSysFuncExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sub_sys_func
     *
     * @mbggenerated Fri Jul 22 18:04:39 CST 2016
     */
    @Delete({
        "delete from sub_sys_func",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sub_sys_func
     *
     * @mbggenerated Fri Jul 22 18:04:39 CST 2016
     */
    @Insert({
        "insert into sub_sys_func (id, appid, ",
        "parentid, funcnamech, ",
        "funcnameen, funcurl, ",
        "funcdesc, funccode, ",
        "priority, ismenu, ",
        "chfuncmid, isapp, ",
        "fk_system_id, createtime, ",
        "creator, del_flag, ",
        "updatetime, icon)",
        "values (#{id,jdbcType=VARCHAR}, #{appid,jdbcType=VARCHAR}, ",
        "#{parentid,jdbcType=VARCHAR}, #{funcnamech,jdbcType=VARCHAR}, ",
        "#{funcnameen,jdbcType=VARCHAR}, #{funcurl,jdbcType=VARCHAR}, ",
        "#{funcdesc,jdbcType=VARCHAR}, #{funccode,jdbcType=VARCHAR}, ",
        "#{priority,jdbcType=DECIMAL}, #{ismenu,jdbcType=DECIMAL}, ",
        "#{chfuncmid,jdbcType=DECIMAL}, #{isapp,jdbcType=VARCHAR}, ",
        "#{fkSystemId,jdbcType=VARCHAR}, #{createtime,jdbcType=TIMESTAMP}, ",
        "#{creator,jdbcType=VARCHAR}, #{delFlag,jdbcType=VARCHAR}, ",
        "#{updatetime,jdbcType=TIMESTAMP}, #{icon,jdbcType=LONGVARBINARY})"
    })
    int insert(SubSysFunc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sub_sys_func
     *
     * @mbggenerated Fri Jul 22 18:04:39 CST 2016
     */
    int insertSelective(SubSysFunc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sub_sys_func
     *
     * @mbggenerated Fri Jul 22 18:04:39 CST 2016
     */
    List<SubSysFunc> selectByExampleWithBLOBs(SubSysFuncExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sub_sys_func
     *
     * @mbggenerated Fri Jul 22 18:04:39 CST 2016
     */
    List<SubSysFunc> selectByExample(SubSysFuncExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sub_sys_func
     *
     * @mbggenerated Fri Jul 22 18:04:39 CST 2016
     */
    @Select({
        "select",
        "id, appid, parentid, funcnamech, funcnameen, funcurl, funcdesc, funccode, priority, ",
        "ismenu, chfuncmid, isapp, fk_system_id, createtime, creator, del_flag, updatetime, ",
        "icon",
        "from sub_sys_func",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @ResultMap("ResultMapWithBLOBs")
    SubSysFunc selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sub_sys_func
     *
     * @mbggenerated Fri Jul 22 18:04:39 CST 2016
     */
    int updateByExampleSelective(@Param("record") SubSysFunc record, @Param("example") SubSysFuncExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sub_sys_func
     *
     * @mbggenerated Fri Jul 22 18:04:39 CST 2016
     */
    int updateByExampleWithBLOBs(@Param("record") SubSysFunc record, @Param("example") SubSysFuncExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sub_sys_func
     *
     * @mbggenerated Fri Jul 22 18:04:39 CST 2016
     */
    int updateByExample(@Param("record") SubSysFunc record, @Param("example") SubSysFuncExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sub_sys_func
     *
     * @mbggenerated Fri Jul 22 18:04:39 CST 2016
     */
    int updateByPrimaryKeySelective(SubSysFunc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sub_sys_func
     *
     * @mbggenerated Fri Jul 22 18:04:39 CST 2016
     */
    @Update({
        "update sub_sys_func",
        "set appid = #{appid,jdbcType=VARCHAR},",
          "parentid = #{parentid,jdbcType=VARCHAR},",
          "funcnamech = #{funcnamech,jdbcType=VARCHAR},",
          "funcnameen = #{funcnameen,jdbcType=VARCHAR},",
          "funcurl = #{funcurl,jdbcType=VARCHAR},",
          "funcdesc = #{funcdesc,jdbcType=VARCHAR},",
          "funccode = #{funccode,jdbcType=VARCHAR},",
          "priority = #{priority,jdbcType=DECIMAL},",
          "ismenu = #{ismenu,jdbcType=DECIMAL},",
          "chfuncmid = #{chfuncmid,jdbcType=DECIMAL},",
          "isapp = #{isapp,jdbcType=VARCHAR},",
          "fk_system_id = #{fkSystemId,jdbcType=VARCHAR},",
          "createtime = #{createtime,jdbcType=TIMESTAMP},",
          "creator = #{creator,jdbcType=VARCHAR},",
          "del_flag = #{delFlag,jdbcType=VARCHAR},",
          "updatetime = #{updatetime,jdbcType=TIMESTAMP},",
          "icon = #{icon,jdbcType=LONGVARBINARY}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKeyWithBLOBs(SubSysFunc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sub_sys_func
     *
     * @mbggenerated Fri Jul 22 18:04:39 CST 2016
     */
    @Update({
        "update sub_sys_func",
        "set appid = #{appid,jdbcType=VARCHAR},",
          "parentid = #{parentid,jdbcType=VARCHAR},",
          "funcnamech = #{funcnamech,jdbcType=VARCHAR},",
          "funcnameen = #{funcnameen,jdbcType=VARCHAR},",
          "funcurl = #{funcurl,jdbcType=VARCHAR},",
          "funcdesc = #{funcdesc,jdbcType=VARCHAR},",
          "funccode = #{funccode,jdbcType=VARCHAR},",
          "priority = #{priority,jdbcType=DECIMAL},",
          "ismenu = #{ismenu,jdbcType=DECIMAL},",
          "chfuncmid = #{chfuncmid,jdbcType=DECIMAL},",
          "isapp = #{isapp,jdbcType=VARCHAR},",
          "fk_system_id = #{fkSystemId,jdbcType=VARCHAR},",
          "createtime = #{createtime,jdbcType=TIMESTAMP},",
          "creator = #{creator,jdbcType=VARCHAR},",
          "del_flag = #{delFlag,jdbcType=VARCHAR},",
          "updatetime = #{updatetime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(SubSysFunc record);
}