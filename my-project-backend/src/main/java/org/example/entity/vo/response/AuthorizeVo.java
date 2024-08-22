package org.example.entity.vo.response;

import lombok.Data;

import java.util.Date;

@Data
public class AuthorizeVo {

    String username;    //用户名
    String token;       //携带的token
    String role;        //角色
    Date expire;        //过期时间
}
