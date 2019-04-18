package com.jk.pojo;

import java.io.Serializable;

/**
 * 类描述：汽车图片表
 * 创建人：孙长江
 * 创建时间：2019/4/1619:36
 * 修改人：孙长江
 * 修改时间：2019/4/1619:36
 * 修改备注：
 */
public class ImgsBean implements Serializable {

    private static final long serialVersionUID = -5786490576826731864L;
    private Integer id;

    private String imgurl;//图片路径

    private Integer carId; //汽车Id

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }
}
