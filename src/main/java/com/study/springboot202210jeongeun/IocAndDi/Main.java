package com.study.springboot202210jeongeun.IocAndDi;

public class Main {

    private final UserService userService;

    public Main(UserService userService) {
        this.userService = userService;
    }

    public void run() {
        userService.createUser();
        userService.getUser();
        userService.updateUser();
        userService.deleteUser();
    }

    public static void main(String[] args){
        UserService userService = UserServiceImpl.getInstance();
        Main main = new Main(userService);
        main.run();
        //Di -> 의존성을 주입했다. 외부에서 주입을 하는 방식
    }

}