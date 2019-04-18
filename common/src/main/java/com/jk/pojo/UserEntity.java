package com.jk.pojo;

public class UserEntity {

    private Integer id;

    private Long phone;//用户手机号

    private Integer carId;//二手车ID

    private String seeTime;//用户看车时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public String getSeeTime() {
        return seeTime;
    }

    public void setSeeTime(String seeTime) {
        this.seeTime = seeTime;
    }
}
