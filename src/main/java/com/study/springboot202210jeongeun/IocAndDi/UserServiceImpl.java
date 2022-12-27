package com.study.springboot202210jeongeun.IocAndDi;

public class UserServiceImpl implements UserService{
    private static UserServiceImpl instance = null;  //single thone 싱글톤 중요
    private UserServiceImpl() {}
    public static UserServiceImpl getInstance() {
        if(instance == null) {
            instance = new UserServiceImpl();
        }
        return instance;
    }

    @Override
    public void createUser() {
        System.out.println("사용자 등록");
    }

    @Override
    public void getUser() {
        System.out.println("사용자 조회");
    }

    @Override
    public void updateUser() {
        System.out.println("사용자 수정");
    }

    @Override
    public void deleteUser() {
        System.out.println("사용자 삭제");
    }
}

