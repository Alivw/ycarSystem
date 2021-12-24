package com.darksnow.controller;

import com.darksnow.service.CarStopService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;


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
    public String stopManager() {

        return "stop-car-manager";
    }
}
