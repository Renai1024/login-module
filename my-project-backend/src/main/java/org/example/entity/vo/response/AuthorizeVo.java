package org.example.entity.vo.response;

import lombok.Data;

import java.util.Date;

@Data
public class AuthorizeVo {

    String username;
    String token;
    String role;
    Date expire;
}
