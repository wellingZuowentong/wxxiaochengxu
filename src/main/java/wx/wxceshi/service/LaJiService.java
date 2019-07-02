package wx.wxceshi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wx.wxceshi.bean.LaJi;
import wx.wxceshi.mapper.LaJiMapper;

import java.util.List;

/**
 * 作者：王怀朋
 * 日期：2019/7/1
 */
@Service
public class LaJiService {
    @Autowired
    private LaJiMapper laJiMapper;

    public int saveLaJi(LaJi laJi){
        return laJiMapper.saveLaJi(laJi);
    }
    public List<LaJi> findAllLaJi(){
        return laJiMapper.findAllLaJi();
    }
    public LaJi findLaJiById(Integer id){
        return laJiMapper.findLaJiById(id);
    }
    public Integer delLaJiById(Integer id){
        return laJiMapper.delLaJiById(id);
    }
    public Integer updateLaJiById(LaJi laJi){
        return laJiMapper.updateLaJiById(laJi);
    }
}
