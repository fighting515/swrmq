package com.smartwasser.swrmq.model;

import java.io.Serializable;
import java.util.Date;

public class BcSysOrg implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -3089364580248815177L;

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BC_SYS_ORG.ID
     *
     * @mbggenerated Tue Jan 20 11:13:30 CST 2015
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BC_SYS_ORG.DEPTNAME
     *
     * @mbggenerated Tue Jan 20 11:13:30 CST 2015
     */
    private String deptname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BC_SYS_ORG.UPPERID
     *
     * @mbggenerated Tue Jan 20 11:13:30 CST 2015
     */
    private String upperid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BC_SYS_ORG.DEPTORDER
     *
     * @mbggenerated Tue Jan 20 11:13:30 CST 2015
     */
    private Long deptorder;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BC_SYS_ORG.DEPTCODE
     *
     * @mbggenerated Tue Jan 20 11:13:30 CST 2015
     */
    private String deptcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BC_SYS_ORG.CREATETIME
     *
     * @mbggenerated Tue Jan 20 11:13:30 CST 2015
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BC_SYS_ORG.CHDEPTMID
     *
     * @mbggenerated Tue Jan 20 11:13:30 CST 2015
     */
    private Long chdeptmid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BC_SYS_ORG.ID
     *
     * @return the value of BC_SYS_ORG.ID
     *
     * @mbggenerated Tue Jan 20 11:13:30 CST 2015
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BC_SYS_ORG.ID
     *
     * @param id the value for BC_SYS_ORG.ID
     *
     * @mbggenerated Tue Jan 20 11:13:30 CST 2015
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BC_SYS_ORG.DEPTNAME
     *
     * @return the value of BC_SYS_ORG.DEPTNAME
     *
     * @mbggenerated Tue Jan 20 11:13:30 CST 2015
     */
    public String getDeptname() {
        return deptname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BC_SYS_ORG.DEPTNAME
     *
     * @param deptname the value for BC_SYS_ORG.DEPTNAME
     *
     * @mbggenerated Tue Jan 20 11:13:30 CST 2015
     */
    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BC_SYS_ORG.UPPERID
     *
     * @return the value of BC_SYS_ORG.UPPERID
     *
     * @mbggenerated Tue Jan 20 11:13:30 CST 2015
     */
    public String getUpperid() {
        return upperid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BC_SYS_ORG.UPPERID
     *
     * @param upperid the value for BC_SYS_ORG.UPPERID
     *
     * @mbggenerated Tue Jan 20 11:13:30 CST 2015
     */
    public void setUpperid(String upperid) {
        this.upperid = upperid == null ? null : upperid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BC_SYS_ORG.DEPTORDER
     *
     * @return the value of BC_SYS_ORG.DEPTORDER
     *
     * @mbggenerated Tue Jan 20 11:13:30 CST 2015
     */
    public Long getDeptorder() {
        return deptorder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BC_SYS_ORG.DEPTORDER
     *
     * @param deptorder the value for BC_SYS_ORG.DEPTORDER
     *
     * @mbggenerated Tue Jan 20 11:13:30 CST 2015
     */
    public void setDeptorder(Long deptorder) {
        this.deptorder = deptorder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BC_SYS_ORG.DEPTCODE
     *
     * @return the value of BC_SYS_ORG.DEPTCODE
     *
     * @mbggenerated Tue Jan 20 11:13:30 CST 2015
     */
    public String getDeptcode() {
        return deptcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BC_SYS_ORG.DEPTCODE
     *
     * @param deptcode the value for BC_SYS_ORG.DEPTCODE
     *
     * @mbggenerated Tue Jan 20 11:13:30 CST 2015
     */
    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode == null ? null : deptcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BC_SYS_ORG.CREATETIME
     *
     * @return the value of BC_SYS_ORG.CREATETIME
     *
     * @mbggenerated Tue Jan 20 11:13:30 CST 2015
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BC_SYS_ORG.CREATETIME
     *
     * @param createtime the value for BC_SYS_ORG.CREATETIME
     *
     * @mbggenerated Tue Jan 20 11:13:30 CST 2015
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BC_SYS_ORG.CHDEPTMID
     *
     * @return the value of BC_SYS_ORG.CHDEPTMID
     *
     * @mbggenerated Tue Jan 20 11:13:30 CST 2015
     */
    public Long getChdeptmid() {
        return chdeptmid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BC_SYS_ORG.CHDEPTMID
     *
     * @param chdeptmid the value for BC_SYS_ORG.CHDEPTMID
     *
     * @mbggenerated Tue Jan 20 11:13:30 CST 2015
     */
    public void setChdeptmid(Long chdeptmid) {
        this.chdeptmid = chdeptmid;
    }
}