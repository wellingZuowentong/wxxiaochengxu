package wx.wxceshi.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import wx.wxceshi.bean.User;
import wx.wxceshi.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 作者：王怀朋
 * 日期：2019/7/1
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("saveUser")
    @ResponseBody
    public int saveUser(HttpServletRequest request, HttpServletResponse response, User user) throws ServletException, IOException {
        // TODO Auto-generated method stub

        response.setContentType("text/html;charset=utf-8");
        //* 设置响应头允许ajax跨域访问 *//*
        response.setHeader("Access-Control-Allow-Origin", "*");
        //* 星号表示所有的异域请求都可以接受， *//*
        response.setHeader("Access-Control-Allow-Methods", "GET,POST");

        //获取微信小程序get的参数值并打印
        //Integer id =Integer.parseInt(request.getParameter("id"));
        //System.out.println("username=" + username + " ,password=" + password);

        //返回值给微信小程序

           return userService.saveUser(user);


    }
    @RequestMapping("delUserById")
    @ResponseBody
    public int delUserById(HttpServletRequest request, HttpServletResponse response,Integer id) throws ServletException, IOException {
        // TODO Auto-generated method stub

        response.setContentType("text/html;charset=utf-8");
        //* 设置响应头允许ajax跨域访问 *//*
        response.setHeader("Access-Control-Allow-Origin", "*");
        //* 星号表示所有的异域请求都可以接受， *//*
        response.setHeader("Access-Control-Allow-Methods", "GET,POST");

        //获取微信小程序get的参数值并打印
        //Integer id =Integer.parseInt(request.getParameter("id"));
        //System.out.println("username=" + username + " ,password=" + password);

        //返回值给微信小程序

        return userService.delUserById(1);


    }
    @RequestMapping("findAllUser")
    @ResponseBody
    public List<User> findAllUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub

        response.setContentType("text/html;charset=utf-8");
        //* 设置响应头允许ajax跨域访问 *//*
        response.setHeader("Access-Control-Allow-Origin", "*");
        //* 星号表示所有的异域请求都可以接受， *//*
        response.setHeader("Access-Control-Allow-Methods", "GET,POST");

        //获取微信小程序get的参数值并打印
        //Integer id =Integer.parseInt(request.getParameter("id"));
        //System.out.println("username=" + username + " ,password=" + password);

        //返回值给微信小程序

        return userService.findAllUser();
    }
    @RequestMapping("updateUserById")
    @ResponseBody
    public int updateUserById(HttpServletRequest request, HttpServletResponse response,User user) throws ServletException, IOException {
        // TODO Auto-generated method stub

        response.setContentType("text/html;charset=utf-8");
        //* 设置响应头允许ajax跨域访问 *//*
        response.setHeader("Access-Control-Allow-Origin", "*");
        //* 星号表示所有的异域请求都可以接受， *//*
        response.setHeader("Access-Control-Allow-Methods", "GET,POST");

        //获取微信小程序get的参数值并打印
        //Integer id =Integer.parseInt(request.getParameter("id"));
        //System.out.println("username=" + username + " ,password=" + password);

        //返回值给微信小程序
        System.out.println(user);

        return userService.updateUserById(user);


    }
}
