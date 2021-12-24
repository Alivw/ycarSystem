package com.darksnow.service.imp;

import com.darksnow.bean.Tuser;
import com.darksnow.mapper.LoginMapper;
import com.darksnow.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginMapper loginMapper;

    //登录
    @Override
    public Tuser loginBy(String userName, String password) {
        return loginMapper.loginBy(userName,password);
    }

    @Override
    public List<Tuser> loginTy() {
        return loginMapper.loginTy();
    }
}
