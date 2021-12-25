package com.darksnow.controller;

import com.darksnow.bean.Tcarstop;
import com.darksnow.service.CarStopService;
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

    @RequestMapping("/stopManager")
    public String stopManager(Model model) {

        List<Tcarstop> list = stopService.list();
        model.addAttribute("carStopList", list);
        return "stop-car-manager";
    }
}
