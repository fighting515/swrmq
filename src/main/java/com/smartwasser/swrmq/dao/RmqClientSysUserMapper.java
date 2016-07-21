package com.smartwasser.swrmq.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.smartwasser.swrmq.model.ClientSysUser;
import com.smartwasser.swrmq.model.ClientSysUserExample;
import com.smartwasser.swrmq.model.ClientSysUserKey;

public interface RmqClientSysUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table client_sys_user
     *
     * @mbggenerated Wed Jul 20 10:25:37 CST 2016
     */
    int countByExample(ClientSysUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table client_sys_user
     *
     * @mbggenerated Wed Jul 20 10:25:37 CST 2016
     */
    int deleteByExample(ClientSysUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table client_sys_user
     *
     * @mbggenerated Wed Jul 20 10:25:37 CST 2016
     */
    @Delete({
        "delete from client_sys_user",
        "where id = #{id,jdbcType=VARCHAR}",
          "and username = #{username,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(ClientSysUserKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table client_sys_user
     *
     * @mbggenerated Wed Jul 20 10:25:37 CST 2016
     */
    @Insert({
        "insert into client_sys_user (id, username, ",
        "password, usernamecn, ",
        "email, fk_client_unti_id, ",
        "state, create_time, ",
        "creator, update_time, ",
        "remark, del_flag, ",
        "super_admin_flag)",
        "values (#{id,jdbcType=VARCHAR}, #{username,jdbcType=VARCHAR}, ",
        "#{password,jdbcType=VARCHAR}, #{usernamecn,jdbcType=VARCHAR}, ",
        "#{email,jdbcType=VARCHAR}, #{fkClientUntiId,jdbcType=VARCHAR}, ",
        "#{state,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{creator,jdbcType=VARCHAR}, #{updateTime,jdbcType=TIMESTAMP}, ",
        "#{remark,jdbcType=VARCHAR}, #{delFlag,jdbcType=VARCHAR}, ",
        "#{superAdminFlag,jdbcType=VARCHAR})"
    })
    int insert(ClientSysUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table client_sys_user
     *
     * @mbggenerated Wed Jul 20 10:25:37 CST 2016
     */
    int insertSelective(ClientSysUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table client_sys_user
     *
     * @mbggenerated Wed Jul 20 10:25:37 CST 2016
     */
    List<ClientSysUser> selectByExample(ClientSysUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table client_sys_user
     *
     * @mbggenerated Wed Jul 20 10:25:37 CST 2016
     */
    @Select({
        "select",
        "id, username, password, usernamecn, email, fk_client_unti_id, state, create_time, ",
        "creator, update_time, remark, del_flag, super_admin_flag",
        "from client_sys_user",
        "where id = #{id,jdbcType=VARCHAR}",
          "and username = #{username,jdbcType=VARCHAR}"
    })
    @ResultMap("BaseResultMap")
    ClientSysUser selectByPrimaryKey(ClientSysUserKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table client_sys_user
     *
     * @mbggenerated Wed Jul 20 10:25:37 CST 2016
     */
    int updateByExampleSelective(@Param("record") ClientSysUser record, @Param("example") ClientSysUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table client_sys_user
     *
     * @mbggenerated Wed Jul 20 10:25:37 CST 2016
     */
    int updateByExample(@Param("record") ClientSysUser record, @Param("example") ClientSysUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table client_sys_user
     *
     * @mbggenerated Wed Jul 20 10:25:37 CST 2016
     */
    int updateByPrimaryKeySelective(ClientSysUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table client_sys_user
     *
     * @mbggenerated Wed Jul 20 10:25:37 CST 2016
     */
    @Update({
        "update client_sys_user",
        "set password = #{password,jdbcType=VARCHAR},",
          "usernamecn = #{usernamecn,jdbcType=VARCHAR},",
          "email = #{email,jdbcType=VARCHAR},",
          "fk_client_unti_id = #{fkClientUntiId,jdbcType=VARCHAR},",
          "state = #{state,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "creator = #{creator,jdbcType=VARCHAR},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "remark = #{remark,jdbcType=VARCHAR},",
          "del_flag = #{delFlag,jdbcType=VARCHAR},",
          "super_admin_flag = #{superAdminFlag,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=VARCHAR}",
          "and username = #{username,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(ClientSysUser record);
}