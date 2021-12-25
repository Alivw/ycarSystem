package com.darksnow.service;

import com.darksnow.bean.Tcartype;

import java.util.List;

public interface CarTypeService {
    //获取车俩类型合集
    List<Tcartype> indexType();

    //新建车辆类型
    void  addType(Integer id, String  carTypeName);

    //根据id删除车辆类型
    Integer delType(Integer id);

    //根据id查询需要修改的车辆类型
    Tcartype getTypeById(Integer id);

    //修改车辆类型
    void updateType(Integer id, String  carTypeName);
}
