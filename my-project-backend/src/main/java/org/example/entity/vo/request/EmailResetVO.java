package org.example.entity.vo.request;

import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class EmailResetVO {
    @Email
    String email;

    @Length(min = 6,max = 6)
    String code;

    @Length(min = 6,max = 18)
    String password;
}
