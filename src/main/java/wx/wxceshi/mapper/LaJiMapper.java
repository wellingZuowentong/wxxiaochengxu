package wx.wxceshi.mapper;

import org.apache.ibatis.annotations.Mapper;
import wx.wxceshi.bean.LaJi;

import java.util.List;

/**
 * 作者：王怀朋
 * 日期：2019/7/1
 */
@Mapper
public interface LaJiMapper {
    public int saveLaJi(LaJi laJi);
    public List<LaJi> findAllLaJi();
    public LaJi findLaJiById(Integer id);
    public Integer delLaJiById(Integer id);
    public Integer updateLaJiById(LaJi laJi);
}
