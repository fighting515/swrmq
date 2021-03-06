package com.smartwasser.swrmq.model;

import java.util.Date;

public class MessageSendTask {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_send_task.data_id
     *
     * @mbggenerated Mon Jul 25 15:29:09 CST 2016
     */
    private String dataId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_send_task.data_table
     *
     * @mbggenerated Mon Jul 25 15:29:09 CST 2016
     */
    private String dataTable;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_send_task.opt_type
     *
     * @mbggenerated Mon Jul 25 15:29:09 CST 2016
     */
    private String optType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_send_task.send_time
     *
     * @mbggenerated Mon Jul 25 15:29:09 CST 2016
     */
    private Date sendTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_send_task.send_state
     *
     * @mbggenerated Mon Jul 25 15:29:09 CST 2016
     */
    private String sendState;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_send_task.create_time
     *
     * @mbggenerated Mon Jul 25 15:29:09 CST 2016
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_send_task.data_id
     *
     * @return the value of message_send_task.data_id
     *
     * @mbggenerated Mon Jul 25 15:29:09 CST 2016
     */
    public String getDataId() {
        return dataId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_send_task.data_id
     *
     * @param dataId the value for message_send_task.data_id
     *
     * @mbggenerated Mon Jul 25 15:29:09 CST 2016
     */
    public void setDataId(String dataId) {
        this.dataId = dataId == null ? null : dataId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_send_task.data_table
     *
     * @return the value of message_send_task.data_table
     *
     * @mbggenerated Mon Jul 25 15:29:09 CST 2016
     */
    public String getDataTable() {
        return dataTable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_send_task.data_table
     *
     * @param dataTable the value for message_send_task.data_table
     *
     * @mbggenerated Mon Jul 25 15:29:09 CST 2016
     */
    public void setDataTable(String dataTable) {
        this.dataTable = dataTable == null ? null : dataTable.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_send_task.opt_type
     *
     * @return the value of message_send_task.opt_type
     *
     * @mbggenerated Mon Jul 25 15:29:09 CST 2016
     */
    public String getOptType() {
        return optType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_send_task.opt_type
     *
     * @param optType the value for message_send_task.opt_type
     *
     * @mbggenerated Mon Jul 25 15:29:09 CST 2016
     */
    public void setOptType(String optType) {
        this.optType = optType == null ? null : optType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_send_task.send_time
     *
     * @return the value of message_send_task.send_time
     *
     * @mbggenerated Mon Jul 25 15:29:09 CST 2016
     */
    public Date getSendTime() {
        return sendTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_send_task.send_time
     *
     * @param sendTime the value for message_send_task.send_time
     *
     * @mbggenerated Mon Jul 25 15:29:09 CST 2016
     */
    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_send_task.send_state
     *
     * @return the value of message_send_task.send_state
     *
     * @mbggenerated Mon Jul 25 15:29:09 CST 2016
     */
    public String getSendState() {
        return sendState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_send_task.send_state
     *
     * @param sendState the value for message_send_task.send_state
     *
     * @mbggenerated Mon Jul 25 15:29:09 CST 2016
     */
    public void setSendState(String sendState) {
        this.sendState = sendState == null ? null : sendState.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_send_task.create_time
     *
     * @return the value of message_send_task.create_time
     *
     * @mbggenerated Mon Jul 25 15:29:09 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_send_task.create_time
     *
     * @param createTime the value for message_send_task.create_time
     *
     * @mbggenerated Mon Jul 25 15:29:09 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}