package com.ys.egou.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class UserLoginForm {
    @NotEmpty(message = "邮箱不能为空")
    private String email;

    @NotEmpty(message = "密码不能为空")
    private String password;

    private Boolean remember;
}
