package com.darksnow.mapper;

import com.darksnow.bean.Tcarares;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CarAresMapper {
    //获取停车区域集合
    List<Tcarares> indexAres();

    //新建停车区域
    void addAres(Integer  id,String  areaName,float  price);

    //根据id删除停车区域
    Integer delAres(Integer id);

    //根据id查询需要修改的停车区域信息
    Tcarares getAresById(Integer id);

    //修改停车区域信息
    void updateAres(Integer  id,String  areaName,float  price);

    /**
     * 获取所有停车区域名称
     * @return
     */
    List<Tcarares> getAllAreas();
}
