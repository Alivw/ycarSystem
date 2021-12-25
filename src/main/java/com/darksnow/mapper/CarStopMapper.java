package com.darksnow.mapper;

import com.darksnow.bean.Tcarstop;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Description TODO
 * @Author jalivv
 * @Date 2021/12/25 09:49
 */
@Mapper
public interface CarStopMapper {


    /**
     * 获取停车列表
     *
     * @return
     */
    List<Tcarstop> list();

    /**
     * 新增
     *
     * @param tcarstop
     * @return
     */
    Integer insert(Tcarstop tcarstop);

    Tcarstop getById(Integer cid);

    Integer update(Tcarstop tcarstop);

    /**
     * 根据 id 删除
     * @param cid
     * @return
     */
    Integer deleteById(Integer cid);
}
