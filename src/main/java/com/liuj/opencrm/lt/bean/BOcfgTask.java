package com.liuj.opencrm.lt.bean;

import java.util.Date;

public class BOcfgTask {
    private Integer cfg_task_id;

    private String task_name;

    private String cfg_task_type_code;

    private String business_class;

    private String task_method;

    private String task_expr;

    private Integer sort_id;

    private Integer staff_id;

    private Date create_date;

    private Date state_date;

    private String state;

    private String remarks;

    public Integer getCfg_task_id() {
        return cfg_task_id;
    }

    public void setCfg_task_id(Integer cfg_task_id) {
        this.cfg_task_id = cfg_task_id;
    }

    public String getTask_name() {
        return task_name;
    }

    public void setTask_name(String task_name) {
        this.task_name = task_name;
    }

    public String getCfg_task_type_code() {
        return cfg_task_type_code;
    }

    public void setCfg_task_type_code(String cfg_task_type_code) {
        this.cfg_task_type_code = cfg_task_type_code;
    }

    public String getBusiness_class() {
        return business_class;
    }

    public void setBusiness_class(String business_class) {
        this.business_class = business_class;
    }

    public String getTask_method() {
        return task_method;
    }

    public void setTask_method(String task_method) {
        this.task_method = task_method;
    }

    public String getTask_expr() {
        return task_expr;
    }

    public void setTask_expr(String task_expr) {
        this.task_expr = task_expr;
    }

    public Integer getSort_id() {
        return sort_id;
    }

    public void setSort_id(Integer sort_id) {
        this.sort_id = sort_id;
    }

    public Integer getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(Integer staff_id) {
        this.staff_id = staff_id;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Date getState_date() {
        return state_date;
    }

    public void setState_date(Date state_date) {
        this.state_date = state_date;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}