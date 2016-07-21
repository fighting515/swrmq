package com.smartwasser.swrmq.model;

import java.util.Date;

public class ClientUnitLinkman {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column client_unit_linkman.id
     *
     * @mbggenerated Wed Jul 20 10:25:10 CST 2016
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column client_unit_linkman.linkman
     *
     * @mbggenerated Wed Jul 20 10:25:10 CST 2016
     */
    private String linkman;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column client_unit_linkman.telephone
     *
     * @mbggenerated Wed Jul 20 10:25:10 CST 2016
     */
    private String telephone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column client_unit_linkman.mobile_phone
     *
     * @mbggenerated Wed Jul 20 10:25:10 CST 2016
     */
    private String mobilePhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column client_unit_linkman.qq
     *
     * @mbggenerated Wed Jul 20 10:25:10 CST 2016
     */
    private String qq;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column client_unit_linkman.weixin
     *
     * @mbggenerated Wed Jul 20 10:25:10 CST 2016
     */
    private String weixin;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column client_unit_linkman.email
     *
     * @mbggenerated Wed Jul 20 10:25:10 CST 2016
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column client_unit_linkman.position
     *
     * @mbggenerated Wed Jul 20 10:25:10 CST 2016
     */
    private String position;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column client_unit_linkman.address
     *
     * @mbggenerated Wed Jul 20 10:25:10 CST 2016
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column client_unit_linkman.fk_client_unit_id
     *
     * @mbggenerated Wed Jul 20 10:25:10 CST 2016
     */
    private String fkClientUnitId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column client_unit_linkman.state
     *
     * @mbggenerated Wed Jul 20 10:25:10 CST 2016
     */
    private String state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column client_unit_linkman.create_time
     *
     * @mbggenerated Wed Jul 20 10:25:10 CST 2016
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column client_unit_linkman.creator
     *
     * @mbggenerated Wed Jul 20 10:25:10 CST 2016
     */
    private String creator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column client_unit_linkman.update_time
     *
     * @mbggenerated Wed Jul 20 10:25:10 CST 2016
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column client_unit_linkman.remark
     *
     * @mbggenerated Wed Jul 20 10:25:10 CST 2016
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column client_unit_linkman.del_flag
     *
     * @mbggenerated Wed Jul 20 10:25:10 CST 2016
     */
    private String delFlag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column client_unit_linkman.id
     *
     * @return the value of client_unit_linkman.id
     *
     * @mbggenerated Wed Jul 20 10:25:10 CST 2016
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column client_unit_linkman.id
     *
     * @param id the value for client_unit_linkman.id
     *
     * @mbggenerated Wed Jul 20 10:25:10 CST 2016
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column client_unit_linkman.linkman
     *
     * @return the value of client_unit_linkman.linkman
     *
     * @mbggenerated Wed Jul 20 10:25:10 CST 2016
     */
    public String getLinkman() {
        return linkman;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column client_unit_linkman.linkman
     *
     * @param linkman the value for client_unit_linkman.linkman
     *
     * @mbggenerated Wed Jul 20 10:25:10 CST 2016
     */
    public void setLinkman(String linkman) {
        this.linkman = linkman == null ? null : linkman.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column client_unit_linkman.telephone
     *
     * @return the value of client_unit_linkman.telephone
     *
     * @mbggenerated Wed Jul 20 10:25:10 CST 2016
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column client_unit_linkman.telephone
     *
     * @param telephone the value for client_unit_linkman.telephone
     *
     * @mbggenerated Wed Jul 20 10:25:10 CST 2016
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column client_unit_linkman.mobile_phone
     *
     * @return the value of client_unit_linkman.mobile_phone
     *
     * @mbggenerated Wed Jul 20 10:25:10 CST 2016
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column client_unit_linkman.mobile_phone
     *
     * @param mobilePhone the value for client_unit_linkman.mobile_phone
     *
     * @mbggenerated Wed Jul 20 10:25:10 CST 2016
     */
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone == null ? null : mobilePhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column client_unit_linkman.qq
     *
     * @return the value of client_unit_linkman.qq
     *
     * @mbggenerated Wed Jul 20 10:25:10 CST 2016
     */
    public String getQq() {
        return qq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column client_unit_linkman.qq
     *
     * @param qq the value for client_unit_linkman.qq
     *
     * @mbggenerated Wed Jul 20 10:25:10 CST 2016
     */
    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column client_unit_linkman.weixin
     *
     * @return the value of client_unit_linkman.weixin
     *
     * @mbggenerated Wed Jul 20 10:25:10 CST 2016
     */
    public String getWeixin() {
        return weixin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column client_unit_linkman.weixin
     *
     * @param weixin the value for client_unit_linkman.weixin
     *
     * @mbggenerated Wed Jul 20 10:25:10 CST 2016
     */
    public void setWeixin(String weixin) {
        this.weixin = weixin == null ? null : weixin.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column client_unit_linkman.email
     *
     * @return the value of client_unit_linkman.email
     *
     * @mbggenerated Wed Jul 20 10:25:10 CST 2016
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column client_unit_linkman.email
     *
     * @param email the value for client_unit_linkman.email
     *
     * @mbggenerated Wed Jul 20 10:25:10 CST 2016
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column client_unit_linkman.position
     *
     * @return the value of client_unit_linkman.position
     *
     * @mbggenerated Wed Jul 20 10:25:10 CST 2016
     */
    public String getPosition() {
        return position;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column client_unit_linkman.position
     *
     * @param position the value for client_unit_linkman.position
     *
     * @mbggenerated Wed Jul 20 10:25:10 CST 2016
     */
    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column client_unit_linkman.address
     *
     * @return the value of client_unit_linkman.address
     *
     * @mbggenerated Wed Jul 20 10:25:10 CST 2016
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column client_unit_linkman.address
     *
     * @param address the value for client_unit_linkman.address
     *
     * @mbggenerated Wed Jul 20 10:25:10 CST 2016
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column client_unit_linkman.fk_client_unit_id
     *
     * @return the value of client_unit_linkman.fk_client_unit_id
     *
     * @mbggenerated Wed Jul 20 10:25:10 CST 2016
     */
    public String getFkClientUnitId() {
        return fkClientUnitId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column client_unit_linkman.fk_client_unit_id
     *
     * @param fkClientUnitId the value for client_unit_linkman.fk_client_unit_id
     *
     * @mbggenerated Wed Jul 20 10:25:10 CST 2016
     */
    public void setFkClientUnitId(String fkClientUnitId) {
        this.fkClientUnitId = fkClientUnitId == null ? null : fkClientUnitId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column client_unit_linkman.state
     *
     * @return the value of client_unit_linkman.state
     *
     * @mbggenerated Wed Jul 20 10:25:10 CST 2016
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column client_unit_linkman.state
     *
     * @param state the value for client_unit_linkman.state
     *
     * @mbggenerated Wed Jul 20 10:25:10 CST 2016
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column client_unit_linkman.create_time
     *
     * @return the value of client_unit_linkman.create_time
     *
     * @mbggenerated Wed Jul 20 10:25:10 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column client_unit_linkman.create_time
     *
     * @param createTime the value for client_unit_linkman.create_time
     *
     * @mbggenerated Wed Jul 20 10:25:10 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column client_unit_linkman.creator
     *
     * @return the value of client_unit_linkman.creator
     *
     * @mbggenerated Wed Jul 20 10:25:10 CST 2016
     */
    public String getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column client_unit_linkman.creator
     *
     * @param creator the value for client_unit_linkman.creator
     *
     * @mbggenerated Wed Jul 20 10:25:10 CST 2016
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column client_unit_linkman.update_time
     *
     * @return the value of client_unit_linkman.update_time
     *
     * @mbggenerated Wed Jul 20 10:25:10 CST 2016
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column client_unit_linkman.update_time
     *
     * @param updateTime the value for client_unit_linkman.update_time
     *
     * @mbggenerated Wed Jul 20 10:25:10 CST 2016
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column client_unit_linkman.remark
     *
     * @return the value of client_unit_linkman.remark
     *
     * @mbggenerated Wed Jul 20 10:25:10 CST 2016
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column client_unit_linkman.remark
     *
     * @param remark the value for client_unit_linkman.remark
     *
     * @mbggenerated Wed Jul 20 10:25:10 CST 2016
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column client_unit_linkman.del_flag
     *
     * @return the value of client_unit_linkman.del_flag
     *
     * @mbggenerated Wed Jul 20 10:25:10 CST 2016
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column client_unit_linkman.del_flag
     *
     * @param delFlag the value for client_unit_linkman.del_flag
     *
     * @mbggenerated Wed Jul 20 10:25:10 CST 2016
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }
}