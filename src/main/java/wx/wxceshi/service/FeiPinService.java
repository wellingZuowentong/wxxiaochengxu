package wx.wxceshi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wx.wxceshi.bean.FeiPin;
import wx.wxceshi.mapper.FeiPinMapper;

import java.util.List;

/**
 * 作者：王怀朋
 * 日期：2019/7/1
 */
@Service
public class FeiPinService {
    @Autowired
    private FeiPinMapper feiPinMapper;

    public int saveFeiPin(FeiPin feiPin){
        return feiPinMapper.saveFeiPin(feiPin);
    }
    public List<FeiPin> findAllFeiPin(){
        return feiPinMapper.findAllFeiPin();
    }
    public FeiPin findFeiPinById(Integer id){
        return feiPinMapper.findFeiPinById(id);
    }
    public Integer delFeiPinById(Integer id){
        return feiPinMapper.delFeiPinById(id);
    }
    public Integer updateFeiPinById(FeiPin feiPin){
        return feiPinMapper.updateFeiPinById(feiPin);
    }
}
