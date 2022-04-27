package com.liuj.opencrm.lt.bean;

public class BOcfgTaskParamValue {
    private Integer id;

    private Integer cfg_task_id;

    private Integer param_id;

    private String param_value;

    private String remarks;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCfg_task_id() {
        return cfg_task_id;
    }

    public void setCfg_task_id(Integer cfg_task_id) {
        this.cfg_task_id = cfg_task_id;
    }

    public Integer getParam_id() {
        return param_id;
    }

    public void setParam_id(Integer param_id) {
        this.param_id = param_id;
    }

    public String getParam_value() {
        return param_value;
    }

    public void setParam_value(String param_value) {
        this.param_value = param_value;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}