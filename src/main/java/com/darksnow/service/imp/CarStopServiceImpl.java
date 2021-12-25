package com.darksnow.service.imp;

import com.darksnow.bean.Tcarstop;
import com.darksnow.mapper.CarStopMapper;
import com.darksnow.service.CarStopService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description TODO
 * @Author jalivv
 * @Date 2021/12/24 21:36
 */
@Service
public class CarStopServiceImpl implements CarStopService {

    @Resource
    private CarStopMapper stopMapper;
    @Override
    public List<Tcarstop> list() {
        return stopMapper.list();

    }
}
