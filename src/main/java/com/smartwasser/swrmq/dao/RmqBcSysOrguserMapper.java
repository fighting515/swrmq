package com.smartwasser.swrmq.dao;

import com.smartwasser.swrmq.model.BcSysOrguser;
import com.smartwasser.swrmq.model.BcSysOrguserExample;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface RmqBcSysOrguserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BC_SYS_ORGUSER
     *
     * @mbggenerated Tue Jan 20 11:13:30 CST 2015
     */
    int countByExample(BcSysOrguserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BC_SYS_ORGUSER
     *
     * @mbggenerated Tue Jan 20 11:13:30 CST 2015
     */
    int deleteByExample(BcSysOrguserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BC_SYS_ORGUSER
     *
     * @mbggenerated Tue Jan 20 11:13:30 CST 2015
     */
    @Insert({
        "insert into BC_SYS_ORGUSER (DEPTID, USERID, ",
        "CURDEPT)",
        "values (#{deptid,jdbcType=VARCHAR}, #{userid,jdbcType=VARCHAR}, ",
        "#{curdept,jdbcType=DECIMAL})"
    })
    int insert(BcSysOrguser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BC_SYS_ORGUSER
     *
     * @mbggenerated Tue Jan 20 11:13:30 CST 2015
     */
    int insertSelective(BcSysOrguser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BC_SYS_ORGUSER
     *
     * @mbggenerated Tue Jan 20 11:13:30 CST 2015
     */
    List<BcSysOrguser> selectByExample(BcSysOrguserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BC_SYS_ORGUSER
     *
     * @mbggenerated Tue Jan 20 11:13:30 CST 2015
     */
    int updateByExampleSelective(@Param("record") BcSysOrguser record, @Param("example") BcSysOrguserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BC_SYS_ORGUSER
     *
     * @mbggenerated Tue Jan 20 11:13:30 CST 2015
     */
    int updateByExample(@Param("record") BcSysOrguser record, @Param("example") BcSysOrguserExample example);
}