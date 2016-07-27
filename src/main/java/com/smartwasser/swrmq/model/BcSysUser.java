package com.smartwasser.swrmq.model;

import java.util.Date;

public class BcSysUser {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bc_sys_user.ID
     *
     * @mbggenerated Mon Jul 25 14:56:37 CST 2016
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bc_sys_user.USERNAME
     *
     * @mbggenerated Mon Jul 25 14:56:37 CST 2016
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bc_sys_user.PASSWORD
     *
     * @mbggenerated Mon Jul 25 14:56:37 CST 2016
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bc_sys_user.USERNAMECN
     *
     * @mbggenerated Mon Jul 25 14:56:37 CST 2016
     */
    private String usernamecn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bc_sys_user.EMAIL
     *
     * @mbggenerated Mon Jul 25 14:56:37 CST 2016
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bc_sys_user.STATE
     *
     * @mbggenerated Mon Jul 25 14:56:37 CST 2016
     */
    private Long state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bc_sys_user.LASTLOGINIP
     *
     * @mbggenerated Mon Jul 25 14:56:37 CST 2016
     */
    private String lastloginip;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bc_sys_user.LASTLOGINTIME
     *
     * @mbggenerated Mon Jul 25 14:56:37 CST 2016
     */
    private Date lastlogintime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bc_sys_user.super_admin_flag
     *
     * @mbggenerated Mon Jul 25 14:56:37 CST 2016
     */
    private String superAdminFlag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bc_sys_user.ID
     *
     * @return the value of bc_sys_user.ID
     *
     * @mbggenerated Mon Jul 25 14:56:37 CST 2016
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bc_sys_user.ID
     *
     * @param id the value for bc_sys_user.ID
     *
     * @mbggenerated Mon Jul 25 14:56:37 CST 2016
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bc_sys_user.USERNAME
     *
     * @return the value of bc_sys_user.USERNAME
     *
     * @mbggenerated Mon Jul 25 14:56:37 CST 2016
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bc_sys_user.USERNAME
     *
     * @param username the value for bc_sys_user.USERNAME
     *
     * @mbggenerated Mon Jul 25 14:56:37 CST 2016
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bc_sys_user.PASSWORD
     *
     * @return the value of bc_sys_user.PASSWORD
     *
     * @mbggenerated Mon Jul 25 14:56:37 CST 2016
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bc_sys_user.PASSWORD
     *
     * @param password the value for bc_sys_user.PASSWORD
     *
     * @mbggenerated Mon Jul 25 14:56:37 CST 2016
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bc_sys_user.USERNAMECN
     *
     * @return the value of bc_sys_user.USERNAMECN
     *
     * @mbggenerated Mon Jul 25 14:56:37 CST 2016
     */
    public String getUsernamecn() {
        return usernamecn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bc_sys_user.USERNAMECN
     *
     * @param usernamecn the value for bc_sys_user.USERNAMECN
     *
     * @mbggenerated Mon Jul 25 14:56:37 CST 2016
     */
    public void setUsernamecn(String usernamecn) {
        this.usernamecn = usernamecn == null ? null : usernamecn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bc_sys_user.EMAIL
     *
     * @return the value of bc_sys_user.EMAIL
     *
     * @mbggenerated Mon Jul 25 14:56:37 CST 2016
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bc_sys_user.EMAIL
     *
     * @param email the value for bc_sys_user.EMAIL
     *
     * @mbggenerated Mon Jul 25 14:56:37 CST 2016
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bc_sys_user.STATE
     *
     * @return the value of bc_sys_user.STATE
     *
     * @mbggenerated Mon Jul 25 14:56:37 CST 2016
     */
    public Long getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bc_sys_user.STATE
     *
     * @param state the value for bc_sys_user.STATE
     *
     * @mbggenerated Mon Jul 25 14:56:37 CST 2016
     */
    public void setState(Long state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bc_sys_user.LASTLOGINIP
     *
     * @return the value of bc_sys_user.LASTLOGINIP
     *
     * @mbggenerated Mon Jul 25 14:56:37 CST 2016
     */
    public String getLastloginip() {
        return lastloginip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bc_sys_user.LASTLOGINIP
     *
     * @param lastloginip the value for bc_sys_user.LASTLOGINIP
     *
     * @mbggenerated Mon Jul 25 14:56:37 CST 2016
     */
    public void setLastloginip(String lastloginip) {
        this.lastloginip = lastloginip == null ? null : lastloginip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bc_sys_user.LASTLOGINTIME
     *
     * @return the value of bc_sys_user.LASTLOGINTIME
     *
     * @mbggenerated Mon Jul 25 14:56:37 CST 2016
     */
    public Date getLastlogintime() {
        return lastlogintime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bc_sys_user.LASTLOGINTIME
     *
     * @param lastlogintime the value for bc_sys_user.LASTLOGINTIME
     *
     * @mbggenerated Mon Jul 25 14:56:37 CST 2016
     */
    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bc_sys_user.super_admin_flag
     *
     * @return the value of bc_sys_user.super_admin_flag
     *
     * @mbggenerated Mon Jul 25 14:56:37 CST 2016
     */
    public String getSuperAdminFlag() {
        return superAdminFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bc_sys_user.super_admin_flag
     *
     * @param superAdminFlag the value for bc_sys_user.super_admin_flag
     *
     * @mbggenerated Mon Jul 25 14:56:37 CST 2016
     */
    public void setSuperAdminFlag(String superAdminFlag) {
        this.superAdminFlag = superAdminFlag == null ? null : superAdminFlag.trim();
    }
}