package com.darksnow.service;

import com.darksnow.bean.Tcarstop;

import java.util.List;

/**
 * @Description TODO
 * @Author jalivv
 * @Date 2021/12/24 21:36
 */
public interface CarStopService {

    /**
     * 获取停车列表
     * @return
     */
    List<Tcarstop> list();

}
