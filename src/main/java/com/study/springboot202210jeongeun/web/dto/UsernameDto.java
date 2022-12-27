package com.study.springboot202210jeongeun.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Pattern;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UsernameDto {
    @Pattern(regexp = "^[a-zA-Z0-9]{5,20}$", message="사용자 이름은 영문, 숫자 조합이어야하며 5자 이상 28자 이하여야 한다")
    private String username;
}
