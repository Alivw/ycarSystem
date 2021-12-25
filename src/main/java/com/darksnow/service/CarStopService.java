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

    boolean updateStopCar(Tcarstop tcarstop, Integer pid);

    /**
     * 停车 离场
     * @param cid
     * @return
     */
    boolean leaveCar(Integer cid);

    /**
     * 根据id 删除
     * @param cid
     * @return
     */
    Integer deleteById(Integer cid);
}
