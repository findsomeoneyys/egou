package com.ys.egou.model.user;

public enum SexEnum {
    UNKNOWN("位置"),
    MALE("支付中"),
    FEMALE("支付成功");

    private String value;
    SexEnum(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
