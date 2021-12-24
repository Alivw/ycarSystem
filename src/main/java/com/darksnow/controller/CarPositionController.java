package com.darksnow.controller;

import com.darksnow.bean.Tcarares;
import com.darksnow.bean.Tcarposition;
import com.darksnow.service.CarAresService;
import com.darksnow.service.CarPositionService;
import jdk.internal.org.objectweb.asm.commons.JSRInlinerAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.async.TimeoutCallableProcessingInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class CarPositionController {
    @Autowired
    private CarPositionService carPositionService;

    @Autowired
    private CarAresService carAresService;

    //查询车位管理信息
    @RequestMapping("/space")
    public String pace() {
        return "car-space-manager";
    }

    @RequestMapping("/spaceManager")
    public String spaceIndex(Model model) {
        List<Tcarposition> indexPos = carPositionService.indexPos();
        model.addAttribute("pageInfoList", indexPos);
        return "car-space-manager";
    }

    //新建车位管理信息/spaceAddShow
    @RequestMapping("/spaceAddShow")
    public String addSpa(Model model) {
        List<Tcarares> list = carAresService.getAllAreas();
        model.addAttribute("carAreaList", list);
        return "car-space-add";
    }

    @PostMapping("/spaceAdd")
    public String add(Tcarposition tcarposition, ModelAndView model) {
        tcarposition.setAddTime(new Date());
        carPositionService.addPos(tcarposition);
        model.addObject("carAreaList", tcarposition.getAreaName());
        return "redirect:/spaceManager";
    }

    @RequestMapping("/spacemanager/spaceManagerDelete")
    public String carPositionDel(String id) {
        carPositionService.delById(id);
        return "redirect:/spaceManager";
    }

    @RequestMapping("/carSpaceUpdate")
    public String carSpaceUpdate(String id, Integer areaId, Model model) {
        Tcarposition tcarposition = carPositionService.getById(id);
        List<Tcarares> allAreas = carAresService.getAllAreas();
        Tcarares tcarares = carAresService.getAresById(areaId);

        model.addAttribute("carAreaList", allAreas);
        model.addAttribute("carPosition", tcarposition);
        return "car-space-update";
    }

    @RequestMapping("/spacemanager/spaceUpdate")
    public String spaceUpdate(Tcarposition tcarposition) {
        carPositionService.update(tcarposition);
        return "redirect:/spaceManager";
    }
}
