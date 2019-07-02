package wx.wxceshi.controller;

import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import wx.wxceshi.bean.FeiPin;
import wx.wxceshi.bean.FeiPinZH;
import wx.wxceshi.bean.LaJi;
import wx.wxceshi.service.FeiPinZHService;
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
public class FeiPinZHController {
    @Autowired
    private FeiPinZHService feiPinZHService;
    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;


    @RequestMapping("findFeiPinZHByName")
    @ResponseBody
    public List<FeiPinZH> findFeiPinZHByName(HttpServletRequest request, HttpServletResponse response, String name) throws ServletException, IOException {
        // TODO Auto-generated method stub
        if(name==null){
            return null;
        }
        response.setContentType("text/html;charset=utf-8");
        //* 设置响应头允许ajax跨域访问 *//*
        response.setHeader("Access-Control-Allow-Origin", "*");
        //* 星号表示所有的异域请求都可以接受， *//*
        response.setHeader("Access-Control-Allow-Methods", "GET,POST");
        //获取微信小程序get的参数值并打印
        //Integer id =Integer.parseInt(request.getParameter("id"));
        //System.out.println("username=" + username + " ,password=" + password);

        //查看redis是否存在该缓存
        List<FeiPinZH> list= (List<FeiPinZH>)(redisTemplate.opsForValue().get("findAllFeiPinZHByName"+name));

        if(null==list){
            //加锁防止过多人进入数据库查询出现并发
            synchronized (this) {
                list= (List<FeiPinZH>)(redisTemplate.opsForValue().get("findAllFeiPinZHByName"+name));
                if (null == list) {
                    list = feiPinZHService.findFeiPinZHByName(name);
                    redisTemplate.opsForValue().set("findAllFeiPinZHByName" + name, list);
                }
            }
        }
        return list;
    }
}
