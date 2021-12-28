package com.darksnow.service.imp;

import com.darksnow.bean.Tcarposition;
import com.darksnow.bean.Tcarstop;
import com.darksnow.mapper.CarPositionMapper;
import com.darksnow.mapper.CarStopMapper;
import com.darksnow.service.CarStopService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.text.DecimalFormat;
import java.util.Date;
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

    @Resource
    private CarPositionMapper positionMapper;
    @Override
    public List<Tcarstop> list() {
        return stopMapper.list();

    }

    @Transactional
    @Override
    public boolean updateStopCar(Tcarstop tcarstop) {
        // 1、 向 stop 表插入一条数据
        Tcarposition p = positionMapper.getById(String.valueOf(tcarstop.getPid()));
        tcarstop.setCarPositionNo(p.getPositionNo());
        tcarstop.setPid(p.getPid());
        tcarstop.setStartTime(new Date());
        Integer insert = stopMapper.insert(tcarstop);

        // 2、 更改停车位的状态为 非空闲
        Tcarposition tcarposition = new Tcarposition();
        tcarposition.setPid(tcarstop.getPid());
        tcarposition.setIsactive(1);
        Integer update = positionMapper.update(tcarposition);

        return insert > 0 && update > 0;
    }

    @Transactional
    @Override
    public boolean leaveCar(Integer cid, Integer pid) {
        // 通过 停车id 找到 那条记录
        Tcarstop carstop = stopMapper.getById(cid);

        // 通过 positionNo 获取 positon ，在通过 areaid 获取价格
        Float areaPrice = positionMapper.getPriceByPid(pid);

        Date start = carstop.getStartTime();
        Date end = new Date();

        // 算出停车时常
        float duration = (end.getTime() - start.getTime()) / (60 * 60 * 1000);
        DecimalFormat format = new DecimalFormat(".00");
        String format1 = format.format(duration);
        duration = Float.valueOf(format1);
        float price = areaPrice * duration;
        String format2 = format.format(price);
        float stopCoat = Float.valueOf(format2);


        carstop.setEndTime(end);
        carstop.setStopDuration(duration);
        carstop.setPrice(areaPrice);
        carstop.setStopCoat(stopCoat);
        Integer update = stopMapper.update(carstop);

        // 将position 的状态改为 空闲
        Tcarposition updateEntity = positionMapper.getByPositionNo(carstop.getCarPositionNo());
        updateEntity.setIsactive(0);
        positionMapper.update(updateEntity);

        return update > 0;
    }

    @Override
    public Integer deleteById(Integer cid) {

        return stopMapper.deleteById(cid);
    }
}
