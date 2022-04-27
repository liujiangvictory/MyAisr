package com.liuj.opencrm.lt.bean;

import java.util.Date;

public class BOinTemplate {
    private Integer row_id;

    private Integer tpl_id;

    private String tpl_name;

    private Integer tpl_type;

    private Integer state;

    private Integer org_id;

    private Integer op_id;

    private Date done_date;

    private String done_code;

    private String version;

    private String remark;

    private String tpl_content;

    public Integer getRow_id() {
        return row_id;
    }

    public void setRow_id(Integer row_id) {
        this.row_id = row_id;
    }

    public Integer getTpl_id() {
        return tpl_id;
    }

    public void setTpl_id(Integer tpl_id) {
        this.tpl_id = tpl_id;
    }

    public String getTpl_name() {
        return tpl_name;
    }

    public void setTpl_name(String tpl_name) {
        this.tpl_name = tpl_name;
    }

    public Integer getTpl_type() {
        return tpl_type;
    }

    public void setTpl_type(Integer tpl_type) {
        this.tpl_type = tpl_type;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getOrg_id() {
        return org_id;
    }

    public void setOrg_id(Integer org_id) {
        this.org_id = org_id;
    }

    public Integer getOp_id() {
        return op_id;
    }

    public void setOp_id(Integer op_id) {
        this.op_id = op_id;
    }

    public Date getDone_date() {
        return done_date;
    }

    public void setDone_date(Date done_date) {
        this.done_date = done_date;
    }

    public String getDone_code() {
        return done_code;
    }

    public void setDone_code(String done_code) {
        this.done_code = done_code;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getTpl_content() {
        return tpl_content;
    }

    public void setTpl_content(String tpl_content) {
        this.tpl_content = tpl_content;
    }
}