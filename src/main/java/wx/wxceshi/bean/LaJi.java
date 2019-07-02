package wx.wxceshi.bean;

import java.io.Serializable;

/**
 * 作者：王怀朋
 * 日期：2019/7/1
 */
public class LaJi implements Serializable {
    private Integer id;
    private String name;
    private String miaoshu;
    private String baokuo;
    private String chuli;
    private String paddress;
    public LaJi(){}

    public LaJi(Integer id, String name, String miaoshu, String baokuo, String chuli, String paddress) {
        this.id = id;
        this.name = name;
        this.miaoshu = miaoshu;
        this.baokuo = baokuo;
        this.chuli = chuli;
        this.paddress = paddress;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiaoshu() {
        return miaoshu;
    }

    public void setMiaoshu(String miaoshu) {
        this.miaoshu = miaoshu;
    }

    public String getBaokuo() {
        return baokuo;
    }

    public void setBaokuo(String baokuo) {
        this.baokuo = baokuo;
    }

    public String getChuli() {
        return chuli;
    }

    public void setChuli(String chuli) {
        this.chuli = chuli;
    }

    public String getPaddress() {
        return paddress;
    }

    public void setPaddress(String paddress) {
        this.paddress = paddress;
    }

    @Override
    public String toString() {
        return "LaJi{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", miaoshu='" + miaoshu + '\'' +
                ", baokuo='" + baokuo + '\'' +
                ", chuli='" + chuli + '\'' +
                ", paddress='" + paddress + '\'' +
                '}';
    }
}
