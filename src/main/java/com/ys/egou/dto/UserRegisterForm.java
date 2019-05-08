package com.ys.egou.dto;

import com.ys.egou.model.user.GenderEnum;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Data
public class UserRegisterForm {
    private String name;

    private String password;

    private String salt;

    private GenderEnum gender;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    private String nickname;

    private String mobile;

    @NotEmpty(message = "邮箱不能为空")
    private String email;

    private String avatar;

}
