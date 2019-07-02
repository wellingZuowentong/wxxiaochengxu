package wx.wxceshi.bean;

import java.io.Serializable;

/**
 * 作者：王怀朋
 * 日期：2019/7/1
 */
public class FeiPinZH extends FeiPin implements Serializable {
    private LaJi laJi;

    public FeiPinZH() {}

    public LaJi getLaJi(){
        return laJi;
    }

    public void setLaJi(LaJi laJi) {
        this.laJi = laJi;
    }

    @Override
    public String toString() {
        return "FeiPinZH{" +
                "laJi=" + laJi +
                '}';
    }
}
