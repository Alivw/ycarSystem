package com.darksnow.mapper;

import com.darksnow.bean.Tcarposition;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface CarPositionMapper {
    //查询车位管理信息
    List<Tcarposition> indexPos();

    //新建车位管理
    void addPos(Integer  pid, Integer areaId, String  positionNo, Date addTime,Integer  isactive,String areaName);

    Integer addPos(Tcarposition tcarposition);

    Integer delById(String id);

    /**
     * 通过id 获取 carposition
     * @param id
     * @return
     */
    Tcarposition getById(String id);

    Integer update(Tcarposition tcarposition);


    Integer getAllCount();

    /**
     * 分页获取 carposition 列表
     *
     * @param pageNo
     * @param pageSize
     * @return
     */
    List<Tcarposition> getFatch(@Param("pageNo") Integer pageNo, @Param("pageSize") Integer pageSize);

    /**
     * 获取空闲的车位列表
     * @return
     */
    List<Tcarposition> getActiveList();

    /**
     * 通过positionNo 获取 price
     * @param carPositionNo
     * @return
     */
    Float getPriceByPid(Integer carPositionNo);

    /**
     * 通过 positionNo 获取 entity
     * @param carPositionNo
     * @return
     */
    Tcarposition getByPositionNo(String carPositionNo);
}
