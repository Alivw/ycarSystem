package com.darksnow.mapper;

import com.darksnow.bean.Tuser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LoginMapper {
    //登录
    Tuser loginBy( String userName , String password);

    //退出登录
    List<Tuser> loginTy();
}
