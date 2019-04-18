package com.jk.pojo;

/**
 * 安全配置
 */
public class SecurityBean {

    private Integer id;

    private String mianAirbag;//主驾驶安全气囊

    private String sideAirbag;//前后排侧气囊

    private String headAirbags;//前后排头部气囊

    private String pressure;//胎压检测

    private String centralLock;//车内中控锁

    private String bodySeat;//儿童座椅接口

    private String noKey;//无钥匙启动

    private String aBS;//防抱死系统

    private String eSP;//车身稳定控制(ESP)

    private Integer carId;

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMianAirbag() {
        return mianAirbag;
    }

    public void setMianAirbag(String mianAirbag) {
        this.mianAirbag = mianAirbag;
    }

    public String getSideAirbag() {
        return sideAirbag;
    }

    public void setSideAirbag(String sideAirbag) {
        this.sideAirbag = sideAirbag;
    }

    public String getHeadAirbags() {
        return headAirbags;
    }

    public void setHeadAirbags(String headAirbags) {
        this.headAirbags = headAirbags;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getCentralLock() {
        return centralLock;
    }

    public void setCentralLock(String centralLock) {
        this.centralLock = centralLock;
    }

    public String getBodySeat() {
        return bodySeat;
    }

    public void setBodySeat(String bodySeat) {
        this.bodySeat = bodySeat;
    }

    public String getNoKey() {
        return noKey;
    }

    public void setNoKey(String noKey) {
        this.noKey = noKey;
    }

    public String getaBS() {
        return aBS;
    }

    public void setaBS(String aBS) {
        this.aBS = aBS;
    }

    public String geteSP() {
        return eSP;
    }

    public void seteSP(String eSP) {
        this.eSP = eSP;
    }
}
