package com.darksnow.service;


import com.darksnow.bean.Tuser;

import java.util.List;

public interface LoginService {
    //登录
    Tuser loginBy(String userName , String password);

    //退出登录
    List<Tuser> loginTy();
}
