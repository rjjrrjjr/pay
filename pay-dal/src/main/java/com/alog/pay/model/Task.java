package com.alog.pay.model;

public class Task {
    private Long id;

    private String wms;

    private Integer type;

    private String name;

    private String attr;

    private Integer calType;

    private String calRule;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWms() {
        return wms;
    }

    public void setWms(String wms) {
        this.wms = wms;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAttr() {
        return attr;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }

    public Integer getCalType() {
        return calType;
    }

    public void setCalType(Integer calType) {
        this.calType = calType;
    }

    public String getCalRule() {
        return calRule;
    }

    public void setCalRule(String calRule) {
        this.calRule = calRule;
    }
}