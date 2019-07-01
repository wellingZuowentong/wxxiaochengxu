package wx.wxceshi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wx.wxceshi.bean.User;
import wx.wxceshi.mapper.UserMapper;

import java.util.List;

/**
 * 作者：王怀朋
 * 日期：2019/7/1
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public int saveUser(User user){
        return userMapper.saveUser(user);
    }
    public List<User> findAllUser(){
        return userMapper.findAllUser();
    }
    public User findUserById(Integer id){
        return userMapper.findUserById(id);
    }
    public Integer delUserById(Integer id){
        return userMapper.delUserById(id);
    }
    public Integer updateUserById(User user){
        return userMapper.updateUserById(user);
    }
}
