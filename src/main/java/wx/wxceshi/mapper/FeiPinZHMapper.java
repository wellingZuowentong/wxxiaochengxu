package wx.wxceshi.mapper;

import org.apache.ibatis.annotations.Mapper;
import wx.wxceshi.bean.FeiPin;
import wx.wxceshi.bean.FeiPinZH;

import java.util.List;

/**
 * 作者：王怀朋
 * 日期：2019/7/1
 */
@Mapper
public interface FeiPinZHMapper {
    public List<FeiPinZH> findFeiPinZHByName(String name);
    public FeiPinZH findFeiPinZH(String name);
}
