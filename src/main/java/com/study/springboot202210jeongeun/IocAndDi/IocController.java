package com.study.springboot202210jeongeun.IocAndDi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IocController {

    //Autowired = 자기 자신에게 맞는객체를 알아서 찾아낸다. @Component를 통해.
    @Autowired //(required=false) : 주입은 필수가 아니다라는 것
    @Qualifier("usi3") //객체를 부르는것(Component에서 설정), usi2=UserServiceImpl2
    private UserService userService;

//    public IocController(UserServiceImpl2 userService) {
//        this.userService = userService;
//    }

    @ResponseBody
    @GetMapping("/ioc")
    public String iocTest() {
        userService.createUser();
        userService.getUser();
        userService.updateUser();
        userService.deleteUser();

        return null;

    }
}
