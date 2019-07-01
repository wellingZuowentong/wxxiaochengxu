package wx.wxceshi.mapper;

import org.apache.ibatis.annotations.Mapper;
import wx.wxceshi.bean.User;

import java.util.List;

/**
 * 作者：王怀朋
 * 日期：2019/7/1
 */
@Mapper
public interface UserMapper {
    public int saveUser(User user);
    public List<User> findAllUser();
    public User findUserById(Integer id);
    public Integer delUserById(Integer id);
    public Integer updateUserById(User user);
}
