package com.bbs.controller;

import com.bbs.entity.title;
import com.bbs.entity.user;
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
    private user user;
    private title title;

    @RequestMapping(value = "/dotitle", method = RequestMethod.POST)
    public String dotitle(HttpServletRequest request, HttpSession session, Model model){
        title.setTitName(request.getParameter("subject"));
        title.setUserId();
      return "main";
    }
    @RequestMapping(value = "/newtitle")
    public String newtitle (Model model){
        System.out.println("regist");
        return "newtitle";
    }

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
    @RequestMapping(value = "/dologin", method = RequestMethod.POST)
    public String doLogin(HttpServletRequest request, HttpSession session, Model model){

        String username=request.getParameter("username");
        String password=request.getParameter("password");
        user=userService.login(username, password);
        if(user!=null){
            java.text.SimpleDateFormat simpleDateFormat = new  java.text.SimpleDateFormat("yy-MM-dd HH:mm:ss");
            java.util.Date currentTime = new  java.util.Date();
            String time =  simpleDateFormat.format(currentTime).toString();
            request.getSession(true); // 创建一个 session
            session.setAttribute("username",username);
            session.setAttribute("time",time);
            session.setAttribute("sex",user.getUsersex());
            session.setAttribute("age",user.getUserage());
            session.setAttribute("tel",user.getUserphone());
            session.setAttribute("email",user.getUseremail());
            session.setAttribute("id",user.getUserid());
            System.out.println("succes");
            return "main";
        }else {
            model.addAttribute("error", "用户名或者密码错误");
            System.out.println("failture");
            return "login";
        }
    }
}
