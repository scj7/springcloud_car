package com.jk.pojo;

import java.io.Serializable;

/**
 * 类描述：用户浏览汽车中间表
 * 创建人：孙长江
 * 创建时间：2019/4/1620:01
 * 修改人：孙长江
 * 修改时间：2019/4/1620:01
 * 修改备注：
 */
public class UserBrowse implements Serializable {

    private static final long serialVersionUID = -3142891446827344335L;
    private Integer id;

    private Integer userId;//用户Id

    private Integer carId;//汽车Id

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }
}
