package com.darksnow.controller;

import com.darksnow.bean.Tcarposition;
import com.darksnow.bean.Tcarstop;
import com.darksnow.bean.Tcartype;
import com.darksnow.service.CarPositionService;
import com.darksnow.service.CarStopService;
import com.darksnow.service.CarTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;


/**
 * @Description TODO
 * @Author jalivv
 * @Date 2021/12/24 21:24
 */
@Controller
public class CarStopController {

    @Resource
    private CarStopService stopService;

    @Resource
    private CarTypeService typeService;

    @Resource
    private CarPositionService positionService;

    @RequestMapping("/stopManager")
    public String stopManager(Model model) {

        List<Tcarstop> list = stopService.list();
        model.addAttribute("carStopList", list);
        return "stop-car-manager";
    }

    @RequestMapping("/stopmanager/updateShow")
    public String updateShow(Model model) {
        // 获取车辆类型
        List<Tcartype> tcartypes = typeService.indexType();

        // 获取空闲的车位列表
        List<Tcarposition> tcarpositions = positionService.getActiveList();
        model.addAttribute("carTypeList", tcartypes);
        model.addAttribute("carPositionList", tcarpositions);
        return "stop-car-add";
    }


    @RequestMapping("/updateStopCar")
    public String updateStopCar(Model model, Tcarstop tcarstop, Integer pid) {
        stopService.updateStopCar(tcarstop, pid);

        return "redirect:/stopManager";
    }

    @RequestMapping("/stopmanager/leaveCar")
    public String leaveCar(Integer cid) {
        stopService.leaveCar(cid);
        return "redirect:/stopManager";
    }
}
