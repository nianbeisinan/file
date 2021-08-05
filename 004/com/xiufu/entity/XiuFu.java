package com.xiufu.entity;

public class XiuFu {
    private int id;
    private int xuhao;
    private int shuliang;
    private String jibie;
    private String yuming;
    private String type;
    private boolean tongzhi;
    private boolean fankui;
    private boolean fuce;
    private boolean xiufu;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getXuhao() {
        return xuhao;
    }

    public void setXuhao(int xuhao) {
        this.xuhao = xuhao;
    }

    public int getShuliang() {
        return shuliang;
    }

    public void setShuliang(int shuliang) {
        this.shuliang = shuliang;
    }

    public String getJibie() {
        return jibie;
    }

    public void setJibie(String jibie) {
        this.jibie = jibie;
    }

    public String getYuming() {
        return yuming;
    }

    public void setYuming(String yuming) {
        this.yuming = yuming;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isTongzhi() {
        return tongzhi;
    }

    public void setTongzhi(boolean tongzhi) {
        this.tongzhi = tongzhi;
    }

    public boolean isFankui() {
        return fankui;
    }

    public void setFankui(boolean fankui) {
        this.fankui = fankui;
    }

    public boolean isFuce() {
        return fuce;
    }

    public void setFuce(boolean fuce) {
        this.fuce = fuce;
    }

    public boolean isXiufu() {
        return xiufu;
    }

    public void setXiufu(boolean xiufu) {
        this.xiufu = xiufu;
    }

    @Override
    public String toString() {
        return "XiuFu{" +
                "id=" + id +
                ", xuhao=" + xuhao +
                ", shuliang=" + shuliang +
                ", jibie='" + jibie + '\'' +
                ", yuming='" + yuming + '\'' +
                ", type='" + type + '\'' +
                ", tongzhi=" + tongzhi +
                ", fankui=" + fankui +
                ", fuce=" + fuce +
                ", xiufu=" + xiufu +
                '}';
    }
}
