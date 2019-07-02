package wx.wxceshi.bean;

import java.io.Serializable;

/**
 * 作者：王怀朋
 * 日期：2019/7/1
 */
public class FeiPin implements Serializable {
    private Integer id;
    private String name;
    private String neirong;
    private String address;
    private Integer lid;

    public FeiPin(){}

    public FeiPin(Integer id, String name, String neirong, String address, Integer lid) {
        this.id = id;
        this.name = name;
        this.neirong = neirong;
        this.address = address;
        this.lid = lid;
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

    public String getNeirong() {
        return neirong;
    }

    public void setNeirong(String neirong) {
        this.neirong = neirong;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    @Override
    public String toString() {
        return "FeiPin{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", neirong='" + neirong + '\'' +
                ", address='" + address + '\'' +
                ", lid=" + lid +
                '}';
    }
}
