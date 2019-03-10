package com.bbs.controller;

import com.bbs.service.adminService;
import com.bbs.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Vector;

/**
 * Created by valar on 2019/1/5.
 */
@Controller
@RequestMapping(value = "")
public class userController {
    @Autowired
    private userService userService;

    @RequestMapping(value = "/doregist", method = RequestMethod.POST)
    public String doregist(HttpServletRequest request, HttpSession session, Model model){
        String username= request.getParameter("username");
        String password = request.getParameter("password");
        String sex = request.getParameter("sex");
        int age = Integer.parseInt(request.getParameter("age"));
        String telephone = request.getParameter("telephone");
        String email = request.getParameter("email");

        if(userService.regist(username,password,sex,age,telephone,email)){
            System.out.println("succes");
            return "login";
        }else {
            model.addAttribute("error", "用户名或者密码错误");
            System.out.println("failture");
            return "error1";
        }
    }
    @RequestMapping(value = "")
    public String doLogin(){
            return "login";
    }

    @RequestMapping(value = "/regist")
    public String regist (Model model){
        System.out.println("regist");
        return "regist";
    }
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String doLogin(HttpServletRequest request, HttpSession session, Model model){
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        if(userService.login(username, password)){
            System.out.println("succes");
            return "main";
        }else {
            model.addAttribute("error", "用户名或者密码错误");
            System.out.println("failture");
            return "login";
        }
    }
}
