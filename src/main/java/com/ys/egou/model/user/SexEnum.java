package com.ys.egou.model.user;

public enum SexEnum {
    UNKNOWN("未知"),
    MALE("男"),
    FEMALE("女");

    private String value;
    SexEnum(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
