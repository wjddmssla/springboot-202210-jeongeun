package com.study.springboot202210jeongeun.web.controller.account;

import com.study.springboot202210jeongeun.service.UserService;
import com.study.springboot202210jeongeun.web.dto.CMRespDto;
import com.study.springboot202210jeongeun.web.dto.UserDto;
import com.study.springboot202210jeongeun.web.dto.UsernameDto;
import com.study.springboot202210jeongeun.web.exception.CustomValidException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/account")
public class AccountApiController {

    @Autowired
    private UserService userService;

    @GetMapping("/username")
    public ResponseEntity<?> duplicateUsername(@Valid UsernameDto usernameDto, BindingResult bindingResult) {
        //^[a-zA-Z]$ = 알파벳만 가능하다, \역슬래쉬는 무조건 두개(두개 써야만 하나로 인식)! \\
        userService.duplicateUsername(usernameDto.getUsername());
        return ResponseEntity.ok().body(new CMRespDto<>("가입 가능한 사용자이름", true));

    }

    @PostMapping("/user")
    public ResponseEntity<?> register(@RequestBody @Valid UserDto userDto, BindingResult bindingResult) {
        return ResponseEntity
                .created(URI.create("/account/login"))
                .body(new CMRespDto<>("회원가입 완료", null));
    }

}