package com.darksnow.controller;

import com.darksnow.bean.Tcarares;
import com.darksnow.bean.Tcarposition;
import com.darksnow.service.CarAresService;
import com.darksnow.service.CarPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        List<Tcarposition> tcarpositions = carPositionService.getFatch(1, 2);
        Integer total = carPositionService.getAllCount();
        int pages = total / 2 + total / 2 == 0 ? 0 : 1;
        Map<String, Integer> map = new HashMap<>();
        map.put("pages", pages);
        map.put("total", total);
        map.put("nextPage", 1 + 1);
        map.put("prePage", 1 - 1);
        map.put("pageSize", 2);
        model.addAttribute("pageInfoList", tcarpositions);
        model.addAttribute("pageInfo", map);
        return "/car-space-manager";
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
    public String carSpaceUpdate(String id, Model model) {
        // 1、通过入参找到要修改哪个一个 position
        Tcarposition tcarposition = carPositionService.getById(id);
        // 2、获取 停车区域列表
        List<Tcarares> allAreas = carAresService.getAllAreas();
        model.addAttribute("carAreaList", allAreas);
        model.addAttribute("carPosition", tcarposition);
        return "car-space-update";
    }

    @RequestMapping("/spacemanager/spaceUpdate")
    public String spaceUpdate(Tcarposition tcarposition) {
        carPositionService.update(tcarposition);
        return "redirect:/spaceManager";
    }


    @RequestMapping("/spacemanager/findAll")
    public String findAll(Integer currPage, Integer pageSize, Model model) {
        List<Tcarposition> tcarpositions = carPositionService.getFatch(currPage, pageSize);
        Integer total = carPositionService.getAllCount();
        int pages = total / pageSize + total % pageSize == 0 ? 0 : 1;
        Map<String, Integer> map = new HashMap<>();
        map.put("pages", pages);
        map.put("total", total);
        map.put("nextPage", currPage + 1);
        map.put("prePage", currPage - 1);
        map.put("pageSize", pageSize);

        model.addAttribute("pageInfoList", tcarpositions);
        model.addAttribute("pageInfo", map);
        return "/car-space-manager";
    }
}
