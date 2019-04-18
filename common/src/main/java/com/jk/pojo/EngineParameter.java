package com.jk.pojo;

/**
 * 发动机参数
 */
public class EngineParameter {

    private Integer id;

    private String displacement;//排量

    private String  intake;//进气形式

    private String cylinder;//气缸

    private Integer maxHorsepower;//最大马力

    private Integer maxTorque;//最大扭矩

    private String  fuelType;//燃料类型

    private Integer fuelModel;//燃油标号

    private String supplyType;//供油方式

    private String standard;//排放标准

    private Integer carId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDisplacement() {
        return displacement;
    }

    public void setDisplacement(String displacement) {
        this.displacement = displacement;
    }

    public String getIntake() {
        return intake;
    }

    public void setIntake(String intake) {
        this.intake = intake;
    }

    public String getCylinder() {
        return cylinder;
    }

    public void setCylinder(String cylinder) {
        this.cylinder = cylinder;
    }

    public Integer getMaxHorsepower() {
        return maxHorsepower;
    }

    public void setMaxHorsepower(Integer maxHorsepower) {
        this.maxHorsepower = maxHorsepower;
    }

    public Integer getMaxTorque() {
        return maxTorque;
    }

    public void setMaxTorque(Integer maxTorque) {
        this.maxTorque = maxTorque;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public Integer getFuelModel() {
        return fuelModel;
    }

    public void setFuelModel(Integer fuelModel) {
        this.fuelModel = fuelModel;
    }

    public String getSupplyType() {
        return supplyType;
    }

    public void setSupplyType(String supplyType) {
        this.supplyType = supplyType;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }
}
