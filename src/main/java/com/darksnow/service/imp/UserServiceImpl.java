package com.darksnow.service.imp;

import com.darksnow.bean.Tuser;
import com.darksnow.mapper.UserMapper;
import com.darksnow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    //获取用户类别合集
    @Override
    public List<Tuser> indexUser() {
        return userMapper.indexUser();
    }

    //根据id删除用户
    @Override
    public Integer deluser(Integer id) {
        return userMapper.deluser(id);
    }

    //新建用户信息
    @Override
    public void adduser(Integer id, String userName, String password, String trueName) {
        userMapper.adduser(id, userName, password, trueName);
    }

    //根据id查询出需要修改的数据
    @Override
    public Tuser getUserById(Integer id) {
        return userMapper.getUserById(id);
    }

    //修改用户信息
    @Override
    public void updateUser(Integer id, String userName, String password, String trueName) {
            userMapper.updateUser(id, userName, password, trueName);
    }




}
