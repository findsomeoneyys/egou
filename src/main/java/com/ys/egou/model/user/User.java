package com.ys.egou.model.user;

import java.util.Date;
import lombok.Data;

@Data
public class User {
    private Integer id;

    /**
     * 用户名称
     */
    private String name;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 性别：UNKNOWN 未知， MALE男， FEMALE 女
     */
    private SexEnum sex;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 用户昵称或网络名称
     */
    private String nickname;

    /**
     * 用户手机号码
     */
    private String mobile;

    /**
     * 用户邮箱
     */
    private String email;

    /**
     * 用户头像图片
     */
    private String avatar;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 逻辑删除
     */
    private Boolean deleted;
}