package wx.wxceshi.mapper;

import org.apache.ibatis.annotations.Mapper;
import wx.wxceshi.bean.FeiPin;

import java.util.List;

/**
 * 作者：王怀朋
 * 日期：2019/7/1
 */
@Mapper
public interface FeiPinMapper {
    public int saveFeiPin(FeiPin feiPin);
    public List<FeiPin> findAllFeiPin();
    public FeiPin findFeiPinById(Integer id);
    public Integer delFeiPinById(Integer id);
    public Integer updateFeiPinById(FeiPin feiPin);
}
