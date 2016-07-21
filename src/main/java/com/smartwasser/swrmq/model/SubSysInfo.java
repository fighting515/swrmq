package com.smartwasser.swrmq.model;

import java.util.Date;

public class SubSysInfo extends SubSysInfoKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sub_sys_info.system_name_ch
     *
     * @mbggenerated Wed Jul 20 10:23:24 CST 2016
     */
    private String systemNameCh;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sub_sys_info.system_name_en
     *
     * @mbggenerated Wed Jul 20 10:23:24 CST 2016
     */
    private String systemNameEn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sub_sys_info.creator
     *
     * @mbggenerated Wed Jul 20 10:23:24 CST 2016
     */
    private String creator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sub_sys_info.del_flag
     *
     * @mbggenerated Wed Jul 20 10:23:24 CST 2016
     */
    private String delFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sub_sys_info.update_time
     *
     * @mbggenerated Wed Jul 20 10:23:24 CST 2016
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sub_sys_info.create_time
     *
     * @mbggenerated Wed Jul 20 10:23:24 CST 2016
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sub_sys_info.remark
     *
     * @mbggenerated Wed Jul 20 10:23:24 CST 2016
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sub_sys_info.system_name_ch
     *
     * @return the value of sub_sys_info.system_name_ch
     *
     * @mbggenerated Wed Jul 20 10:23:24 CST 2016
     */
    public String getSystemNameCh() {
        return systemNameCh;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sub_sys_info.system_name_ch
     *
     * @param systemNameCh the value for sub_sys_info.system_name_ch
     *
     * @mbggenerated Wed Jul 20 10:23:24 CST 2016
     */
    public void setSystemNameCh(String systemNameCh) {
        this.systemNameCh = systemNameCh == null ? null : systemNameCh.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sub_sys_info.system_name_en
     *
     * @return the value of sub_sys_info.system_name_en
     *
     * @mbggenerated Wed Jul 20 10:23:24 CST 2016
     */
    public String getSystemNameEn() {
        return systemNameEn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sub_sys_info.system_name_en
     *
     * @param systemNameEn the value for sub_sys_info.system_name_en
     *
     * @mbggenerated Wed Jul 20 10:23:24 CST 2016
     */
    public void setSystemNameEn(String systemNameEn) {
        this.systemNameEn = systemNameEn == null ? null : systemNameEn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sub_sys_info.creator
     *
     * @return the value of sub_sys_info.creator
     *
     * @mbggenerated Wed Jul 20 10:23:24 CST 2016
     */
    public String getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sub_sys_info.creator
     *
     * @param creator the value for sub_sys_info.creator
     *
     * @mbggenerated Wed Jul 20 10:23:24 CST 2016
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sub_sys_info.del_flag
     *
     * @return the value of sub_sys_info.del_flag
     *
     * @mbggenerated Wed Jul 20 10:23:24 CST 2016
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sub_sys_info.del_flag
     *
     * @param delFlag the value for sub_sys_info.del_flag
     *
     * @mbggenerated Wed Jul 20 10:23:24 CST 2016
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sub_sys_info.update_time
     *
     * @return the value of sub_sys_info.update_time
     *
     * @mbggenerated Wed Jul 20 10:23:24 CST 2016
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sub_sys_info.update_time
     *
     * @param updateTime the value for sub_sys_info.update_time
     *
     * @mbggenerated Wed Jul 20 10:23:24 CST 2016
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sub_sys_info.create_time
     *
     * @return the value of sub_sys_info.create_time
     *
     * @mbggenerated Wed Jul 20 10:23:24 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sub_sys_info.create_time
     *
     * @param createTime the value for sub_sys_info.create_time
     *
     * @mbggenerated Wed Jul 20 10:23:24 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sub_sys_info.remark
     *
     * @return the value of sub_sys_info.remark
     *
     * @mbggenerated Wed Jul 20 10:23:24 CST 2016
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sub_sys_info.remark
     *
     * @param remark the value for sub_sys_info.remark
     *
     * @mbggenerated Wed Jul 20 10:23:24 CST 2016
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}