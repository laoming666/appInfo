package cn.sp.appinfo.controller;


import cn.sp.appinfo.dao.DevUserDao;
import cn.sp.appinfo.entity.DevUser;
import cn.sp.appinfo.service.DevUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/dev")
public class DevUserController {
    @Resource
    private DevUserService devUserService;
    @RequestMapping("/beforeLogin")
    public String beforeLogin(){
        System.out.println("1111111111111111111111111");
        return  "devlogin";
    }
    @RequestMapping("/login")
    public String Login(String devCode, String devpPassword, HttpSession session, Model model){
        DevUser devUser =devUserService.login(devCode,devpPassword);
        if(devUser != null){
            session.setAttribute("devUserSession",devUser);
            return "developer/main";
        }else {
            model.addAttribute("error","用户名或者密码错误");
            return "devlogin";
        }
    }
}
