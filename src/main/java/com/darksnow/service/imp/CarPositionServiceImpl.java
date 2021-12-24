package com.darksnow.service.imp;

import com.darksnow.bean.Tcarposition;
import com.darksnow.mapper.CarPositionMapper;
import com.darksnow.service.CarPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CarPositionServiceImpl implements CarPositionService {

    @Autowired
    private CarPositionMapper carPositionMapper;

    //查询车位管理信息
    @Override
    public List<Tcarposition> indexPos() {
        return carPositionMapper.indexPos();
    }

    //新建车位管理
    @Override
    public void addPos(Integer pid, Integer areaId, String positionNo, Date addTime, Integer isactive, String areaName) {
        carPositionMapper.addPos(pid, areaId, positionNo, addTime, isactive, areaName);
    }

    @Override
    public Integer addPos(Tcarposition tcarposition) {

        return carPositionMapper.addPos(tcarposition);
    }

    @Override
    public Integer delById(String id) {
        return carPositionMapper.delById(id);




    }

    @Override
    public Tcarposition getById(String id) {

        return carPositionMapper.getById(id);
    }

    @Override
    public Integer update(Tcarposition tcarposition) {

        return carPositionMapper.update(tcarposition);
    }

    @Override
    public Integer getAllCount() {
        return carPositionMapper.getAllCount();
    }

    @Override
    public List<Tcarposition> getFatch(Integer currPage, Integer pageSize) {
        Integer pageNo = (currPage - 1) * pageSize;
        return carPositionMapper.getFatch(pageNo, pageSize);
    }



}
