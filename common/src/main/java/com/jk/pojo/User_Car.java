package com.jk.pojo;

import java.io.Serializable;

/**
 * 类描述：用户收藏汽车中间表
 * 创建人：孙长江
 * 创建时间：2019/4/1619:59
 * 修改人：孙长江
 * 修改时间：2019/4/1619:59
 * 修改备注：
 */
public class User_Car implements Serializable {

    private static final long serialVersionUID = -1231210677251850543L;
    private Integer id;

    private Integer userId;//用户Id

    private Integer carId;//收藏的汽车Id

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
