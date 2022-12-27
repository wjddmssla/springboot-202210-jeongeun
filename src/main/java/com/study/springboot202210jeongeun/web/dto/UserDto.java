package com.study.springboot202210jeongeun.web.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDto {
    private int userId;

    @Pattern(regexp = "^[a-zA-Z0-9]{5,20}$", message="사용자 이름은 영문, 숫자 조합이어야하며 5자 이상 28자 이하여야 한다")
    private String username;
    //bbbbbbba 긍정형 전방탐색(?=) a전까지 다 쓸 수 있다.
    //bbbbbbba 부정형 전방탐색(?!) a가 발견된 것까지 쓸 수 없는 것이다.
    @Pattern(regexp= "^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[~!@#$%^&*])[a-zA-Z0-9~!@#$%^&*]{8,16}$", message = "비밀번호는 영문, 숫자, 특수문자를 포함해 8~16자로 작성해라. ")
    private String password;

    @Pattern(regexp="^[가-힇]{2,5}$", message="이름은 한글만 작성 가능하며 2자이상 최대 5자까지만 입력가능하다")
    private String name;

    @NotBlank(message = "이메일을 입력해라")
    @Email
    private String email;
}
