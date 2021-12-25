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
     * @return
     */
    List<Tcarstop> list();
}
