package com.neuedu.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import com.neuedu.util.Page;
import lombok.Data;

import java.util.Date;

@Data
public class User extends Page {
    private Integer id;
    private String loginId;
    private String name;
    private String phone;
    private String password;
    private Integer sex;
    @JSONField(format = "yyyy/MM/dd")
    private Date birthday;
    private String email;
    private String address;
    private Integer isDel;

}
