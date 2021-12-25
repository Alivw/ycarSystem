package com.darksnow.service.imp;

import com.darksnow.bean.Tcarares;
import com.darksnow.mapper.CarAresMapper;
import com.darksnow.service.CarAresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarAresServiceImpl implements CarAresService {
    @Autowired
     private  CarAresMapper carAresMapper;

    //获取停车区域集合
    @Override
    public List<Tcarares> indexAres() {
        return carAresMapper.indexAres();
    }

    //新建停车区域
    @Override
    public void addAres(Integer id, String areaName, float price) {
        carAresMapper.addAres(id, areaName, price);
    }

    //根据id删除停车区域
    @Override
    public Integer delAres(Integer id) {
        return carAresMapper.delAres(id);
    }

    //根据id查询需要修改的停车区域信息
    @Override
    public Tcarares getAresById(Integer id) {
        return carAresMapper.getAresById(id);
    }

    //修改停车区域信息
    @Override
    public void updateAres(Integer id, String areaName, float price) {
        carAresMapper.updateAres(id, areaName, price);
    }

    @Override
    public List<Tcarares> getAllAreas() {
        return carAresMapper.getAllAreas();

    }
}
