package org.example.entity.vo.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class EmailRegisterVO {

    @Email
    @Length(min = 6)
    String email;

    @Length(max = 6, min = 6)
    String code;

    @Pattern(regexp = "^[a-zA-Z0-9\\u4e00-\\u9fa5]+$")
    @Length(min = 3, max = 12)
    String username;

    @Length(min = 6, max = 18)
    String password;
}
