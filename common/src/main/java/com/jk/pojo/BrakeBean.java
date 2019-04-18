package com.jk.pojo;

/**
 * 底盘及制动
 */
public class BrakeBean {

    private Integer id;

    private String brakeType;//驱动方式

    private String helpType;//助力类型

    private String frontSuspension;//前悬挂

    private String rearSuspension;//后悬挂

    private String frontBrake;//前制动

    private String rearBrake;//后制动

    private String stopBrake;//驻车制动类型

    private String frontLuntai;//前轮胎规格

    private String rearLuntai;//后轮胎规格

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

    public String getBrakeType() {
        return brakeType;
    }

    public void setBrakeType(String brakeType) {
        this.brakeType = brakeType;
    }

    public String getHelpType() {
        return helpType;
    }

    public void setHelpType(String helpType) {
        this.helpType = helpType;
    }

    public String getFrontSuspension() {
        return frontSuspension;
    }

    public void setFrontSuspension(String frontSuspension) {
        this.frontSuspension = frontSuspension;
    }

    public String getRearSuspension() {
        return rearSuspension;
    }

    public void setRearSuspension(String rearSuspension) {
        this.rearSuspension = rearSuspension;
    }

    public String getFrontBrake() {
        return frontBrake;
    }

    public void setFrontBrake(String frontBrake) {
        this.frontBrake = frontBrake;
    }

    public String getRearBrake() {
        return rearBrake;
    }

    public void setRearBrake(String rearBrake) {
        this.rearBrake = rearBrake;
    }

    public String getStopBrake() {
        return stopBrake;
    }

    public void setStopBrake(String stopBrake) {
        this.stopBrake = stopBrake;
    }

    public String getFrontLuntai() {
        return frontLuntai;
    }

    public void setFrontLuntai(String frontLuntai) {
        this.frontLuntai = frontLuntai;
    }

    public String getRearLuntai() {
        return rearLuntai;
    }

    public void setRearLuntai(String rearLuntai) {
        this.rearLuntai = rearLuntai;
    }
}
