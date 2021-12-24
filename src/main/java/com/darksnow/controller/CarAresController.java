package com.darksnow.controller;

import com.darksnow.bean.Tcarares;
import com.darksnow.service.CarAresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CarAresController {
    @Autowired
    private CarAresService carAresService;

    /**
     *获取停车区域集合
     */
    @RequestMapping("/ares")
    public String ares(){
        return "car-area-manager";
    }
    @RequestMapping("/areaManager")
    public String are(Model model){
        List<Tcarares> tcarares = carAresService.indexAres();
        model.addAttribute("carAreaList",tcarares);
        return "car-area-manager";

    }

    /**
     * 新建停车区域
     */
    @RequestMapping("/carAreaAdd")
    public String addA(){
        return "car-area-add";
    }
    @PostMapping("/areaManagerAdd")
    public ModelAndView  areAdd(Integer  id,String  areaName,float  price){
        carAresService.addAres(id, areaName, price);
        return new ModelAndView("redirect:/areaManager");
    }

    /**
     * 根据id删除停车区域
     */
    @RequestMapping("/areaManagerDelete")
    public ModelAndView delArea(Integer id,Model model){
        Integer delAres = carAresService.delAres(id);
        if(delAres != 0){
            model.addAttribute("msg","删除失败!");
        }else {
            model.addAttribute("msg","删除成功!");
        }
        return new ModelAndView("redirect:/areaManager");
    }

    /**
     * 根据id查询需要修改的停车区域信息
     */
    @RequestMapping("/getAreaById")
    public String getArea(Integer id,Model model){
        Tcarares aresById = carAresService.getAresById(id);
        model.addAttribute("id",id);
        model.addAttribute("carArea",aresById);
        return"car-area-update";
    }
    /**
     * 修改停车区域信息
     */
    @GetMapping("/areaManagerUpdate")
    public ModelAndView areaUpdate(Model model,Integer  id,String  areaName,float  price){
        carAresService.updateAres(id, areaName, price);
        return new ModelAndView("redirect:/areaManager");
    }
}
