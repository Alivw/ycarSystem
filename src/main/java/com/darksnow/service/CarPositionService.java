package com.darksnow.service;

import com.darksnow.bean.Tcarposition;

import java.util.Date;
import java.util.List;

public interface CarPositionService {
    //查询车位管理信息
    List<Tcarposition> indexPos();

    //新建车位管理
    void addPos(Integer  pid, Integer areaId, String  positionNo, Date addTime, Integer  isactive, String areaName);

    Integer addPos(Tcarposition tcarposition);

    Integer delById(String id);

    /**
     * 通过id 获取 carposition
     * @param id
     * @return
     */
    Tcarposition getById(String id);

    /**
     * 修改
     * @param tcarposition
     * @return
     */
    Integer update(Tcarposition tcarposition);
}
