package com.ys.egou.model.user;

public enum GenderEnum {
    OTHER("未知"),
    MALE("男"),
    FEMALE("女");

    private String value;
    GenderEnum(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
