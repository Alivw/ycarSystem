package com.darksnow.controller;

import com.darksnow.bean.Tuser;
import com.darksnow.service.LoginService;
import com.darksnow.utlis.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;

    /***
     * 登录,并将帐号和密码存入session
     * @return
     */
    @RequestMapping("/")
    public String login(){
        return "login";
    }
    @RequestMapping(value = "/loginCheck")
    public String loginBy(String userName, String password, Model model, HttpSession session){
        Tuser tuser = loginService.loginBy(userName, MD5Utils.md5Password(password));
        if (tuser != null){
            session.setAttribute("loginUser",tuser.getUserName());
            return "index";
        }
        model.addAttribute("loginResult",false);
        return "login";
    }

    /**
     * 退出登录并清空session
     */
    @RequestMapping(value = "/loginOut")
    public  String loginTy(HttpSession session){
        session.invalidate();
        return "login";
    }

}
