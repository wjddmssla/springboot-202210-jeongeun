package com.study.springboot202210jeongeun.web.controller;

import com.study.springboot202210jeongeun.web.dto.RequestStudyDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerStudy {

    @GetMapping("/study/page")
    public String 페이지응답() {
        return "page_study";
    }

    @ResponseBody
    @GetMapping("/study/text/1")
    public String 문자열데이터응답() {
        return "page_study";
    }

    @ResponseBody
    @GetMapping("/study/text/2")
    public String 요청데이터Params(String data1, int data2) {
        return "문자열: " + data1 + ", 숫자: " + data2;
    }

    @ResponseBody
    @GetMapping("/study/text/3")
    public String 요청데이터Obj(RequestStudyDto requestStudyDto) {
        return requestStudyDto.toString();
    }

    @ResponseBody
    @PostMapping("/study/student/1")
    public String getJsonAjax(@RequestBody RequestStudyDto requestStudyDto) {
        return requestStudyDto.toString();
    }

    @ResponseBody
    @GetMapping("/study/student/2")
    public ResponseEntity<?> getJsonAjax2() {
        RequestStudyDto requestStudyDto = new RequestStudyDto();
        requestStudyDto.setName("aaa");
        requestStudyDto.setEmail("aaa@gmail.com");
        requestStudyDto.setAddress("부산 부산진구 가야동");

        return new ResponseEntity<>(requestStudyDto, HttpStatus.OK);
    }

}
