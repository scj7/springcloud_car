package com.jk.pojo;

/**
 * 基本参数表
 */
public class BasicParameter {

    private Integer id;

    private String brandModel;//证件品牌型号

    private String vendor;//厂商

    private String level;//级别

    private String engine;//发动机

    private String transmission;//变速箱

    private String structure;//车身结构

    private String volume;//长宽高

    private Integer wheelbase;//轴距

    private Integer luggageVolume;//行李箱容积

    private Integer weight;//整备质量

    private Integer carId; //汽车id

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrandModel() {
        return brandModel;
    }

    public void setBrandModel(String brandModel) {
        this.brandModel = brandModel;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public Integer getWheelbase() {
        return wheelbase;
    }

    public void setWheelbase(Integer wheelbase) {
        this.wheelbase = wheelbase;
    }

    public Integer getLuggageVolume() {
        return luggageVolume;
    }

    public void setLuggageVolume(Integer luggageVolume) {
        this.luggageVolume = luggageVolume;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }
}
