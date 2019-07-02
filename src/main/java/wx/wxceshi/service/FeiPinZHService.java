package wx.wxceshi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wx.wxceshi.bean.FeiPin;
import wx.wxceshi.bean.FeiPinZH;
import wx.wxceshi.mapper.FeiPinMapper;
import wx.wxceshi.mapper.FeiPinZHMapper;

import java.util.List;

/**
 * 作者：王怀朋
 * 日期：2019/7/1
 */
@Service
public class FeiPinZHService {
    @Autowired
    private FeiPinZHMapper feiPinZHMapper;
    public List<FeiPinZH> findFeiPinZHByName(String name){
        return feiPinZHMapper.findFeiPinZHByName(name);
    }
    public FeiPinZH findFeiPinZH(String name){
        return feiPinZHMapper.findFeiPinZH(name);
    }
}
