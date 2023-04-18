package com.studyconnect.member.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;

@Getter
public class CreateMemberRequest {

    @Email(message = "이메일 형식이 아닙니다.")
    @NotBlank(message = "이메일은 필수값입니다.")
    private String email;

    @NotBlank(message = "비밀번호는 필수값입니다.")
    @Pattern(regexp = "",
            message = "비밀번호는 ~~~~~ 합니다.")
    private String password;

    @Size(max = 255)
    @NotBlank(message = "이름은 필수값입니다.")
    @Pattern(regexp = "",
            message = "이름은 한글과 영어만 입력 가능합니다.")
    private String name;

}
