package com.darksnow.service.imp;

import com.darksnow.bean.Tcartype;
import com.darksnow.bean.Tuser;
import com.darksnow.mapper.CarTypeMapper;
import com.darksnow.service.CarTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarTypeServiceImpl implements CarTypeService {
    @Autowired
    private CarTypeMapper carTypeMapper;

    //获取车辆类型合集
    @Override
    public List<Tcartype> indexType() {
        return carTypeMapper.indexType();
    }


    //新建车辆类型
    @Override
    public void addType(Integer id, String carTypeName) {
         carTypeMapper.addType(id, carTypeName);
    }

    //根据id删除车辆类型
    @Override
    public Integer delType(Integer id) {
        return carTypeMapper.delType(id);
    }

    //根据id查询需要修改的车辆类型
    @Override
    public Tcartype getTypeById(Integer id) {
        return carTypeMapper.getTypeById(id);
    }

    //修改车辆类型
    @Override
    public void updateType(Integer id, String carTypeName) {
        carTypeMapper.updateType(id, carTypeName);
    }


}
