package com.darksnow.service;

import com.darksnow.bean.Tuser;

import java.util.List;

public interface UserService {
    //获取用户类别合集
    List<Tuser> indexUser();

    //根据id对用户进行删除
    Integer deluser(Integer id);

    //新建用户信息userManagerAdd
    void adduser(Integer id,String userName,String password,String trueName);


    //修改用户信息
    void updateUser(Integer id,String userName,String password,String trueName);

    //根据id查询需要修改的信息
    Tuser getUserById(Integer id);
}
