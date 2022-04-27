package com.liuj.opencrm.lt.bean;

public class BOinBusiCfg {
    private Integer busi_id;

    private String busi_name;

    private String method;

    private String sys_code;

    private String webservice_method;

    private String reply_type;

    private Integer protocol_type;

    private Integer max_retry_times;

    private Integer delay_time;

    private String remark;

    public Integer getBusi_id() {
        return busi_id;
    }

    public void setBusi_id(Integer busi_id) {
        this.busi_id = busi_id;
    }

    public String getBusi_name() {
        return busi_name;
    }

    public void setBusi_name(String busi_name) {
        this.busi_name = busi_name;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getSys_code() {
        return sys_code;
    }

    public void setSys_code(String sys_code) {
        this.sys_code = sys_code;
    }

    public String getWebservice_method() {
        return webservice_method;
    }

    public void setWebservice_method(String webservice_method) {
        this.webservice_method = webservice_method;
    }

    public String getReply_type() {
        return reply_type;
    }

    public void setReply_type(String reply_type) {
        this.reply_type = reply_type;
    }

    public Integer getProtocol_type() {
        return protocol_type;
    }

    public void setProtocol_type(Integer protocol_type) {
        this.protocol_type = protocol_type;
    }

    public Integer getMax_retry_times() {
        return max_retry_times;
    }

    public void setMax_retry_times(Integer max_retry_times) {
        this.max_retry_times = max_retry_times;
    }

    public Integer getDelay_time() {
        return delay_time;
    }

    public void setDelay_time(Integer delay_time) {
        this.delay_time = delay_time;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}