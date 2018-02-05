package com.majunwei.jbone.sys.service.model.user;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class UserBaseInfoModel {
    private int id;
    private String username;
    private String password;
    private String realname;
    private String avatar;
    private String phone;
    private String email;
    private int sex;
    private int locked;
    private Timestamp addTime;
    private Timestamp updateTime;
}
