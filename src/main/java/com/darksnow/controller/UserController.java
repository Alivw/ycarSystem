package com.darksnow.controller;

import com.darksnow.bean.Tuser;
import com.darksnow.service.UserService;
import com.darksnow.utlis.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;


    @RequestMapping("/index")
    public String indexS(){
        return "index";
    }
    @RequestMapping("umg")
    public String user(){
        return "user-manager";
    }
    /**
     * 获取到用户信息
     */
    @RequestMapping("/userManager")
    public  String indexUser(Model model){
        List<Tuser> tusers = userService.indexUser();
        model.addAttribute("userList",tusers);
        return "user-manager";
    }

    /**
     * 根据id删除用户信息
     */
//    @RequestMapping("/del")
//    public ModelAndView del(HttpServletRequest request){
//        int id = Integer.parseInt(request.getParameter("user"));
//        userService.deluser(id);
//        return new ModelAndView("redirect:/userManager");
//    }


    /**
     * 根据id删除用户信息
     */
    @RequestMapping("//userManager/userManagerDelete")
    public ModelAndView delByJalivv(Integer id, Model model) {
        Integer res = userService.deluser(id);
        if (res != 0) {
            model.addAttribute("msg", "删除失败!");
        }else {
            model.addAttribute("msg", "删除成功!");
        }
        return new ModelAndView("redirect:/userManager");
    }

    /**
     * 新建用户信息insertUser
     */

    @RequestMapping("/addPate")
    public String index(){
        return "user-manager-add";
    }
    @PostMapping("/insertUser")
    public ModelAndView adduser(Integer id,String userName,String password,String trueName){
        userService.adduser(id, userName, MD5Utils.md5Password(password), trueName);
        return new ModelAndView("redirect:/userManager");
    }

    /**
     * 根据id查询出修改信息
     */
    @RequestMapping("/getUserById")
    public String update(Model model,Integer id){
        Tuser user = userService.getUserById(id);
        model.addAttribute("id",id);
        model.addAttribute("user",user);
        return "user-manager-update";
    }

    /**
     * 修改用户信息
     * 获取用户信息进行更新
     */
    @GetMapping("/userUpdate")
    public ModelAndView userUpdate(Model model,Integer id,String userName,String password,String trueName){
        userService.updateUser(id, userName, MD5Utils.md5Password(password), trueName);
        return new ModelAndView("redirect:/userManager");
    }

}
