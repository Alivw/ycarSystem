package com.darksnow.controller;

import com.darksnow.bean.Tcartype;
import com.darksnow.service.CarTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CarTypeController {

    @Autowired
    private CarTypeService carTypeService;


    /**
     * 车辆类型管理
     */
    @RequestMapping("/type")
    public String type(){
        return "car-type-manager";
    }
    @RequestMapping("/typeManager")
    public String indexType(Model model){
        List<Tcartype> tcartypes = carTypeService.indexType();
        model.addAttribute("carTypeList",tcartypes);
        return "car-type-manager";
    }

    /**
     * 新建车辆类型
     */
    @RequestMapping("/carAdd")
    public String car(){
        return "car-type-add";
    }
    @PostMapping("/typeManagerAdd")
    public ModelAndView addCar(Integer id,String carTypeName){
        carTypeService.addType(id, carTypeName);
        return new ModelAndView("redirect:/typeManager");
    }

    /**
     * 根据id删除车辆类型
     */
    @RequestMapping("/typeManagerDelete")
    public ModelAndView deyCarType(Integer id,Model model){
        Integer type = carTypeService.delType(id);
        if (type != 0){
            model.addAttribute("msg","删除失败!");
        }else {
            model.addAttribute("msg","删除成功!");
        }
        return new ModelAndView("redirect:/typeManager");
    }

    /**
     * 根据id查询出修改信息
     */
    @RequestMapping("/getCarById")
    public String update(Model model,Integer id){
        Tcartype type = carTypeService.getTypeById(id);
        model.addAttribute("id",id);
        model.addAttribute("carType",type);
        return  "car-type-update";
    }

    /**
     * 修改车辆类型
     */
    @GetMapping("/typeManagerUpdate")
    public  ModelAndView carTypeUpdate(Model model,Integer id,String carTypeName){
        carTypeService.updateType(id, carTypeName);
        return new ModelAndView("redirect:/typeManager");
    }
}
