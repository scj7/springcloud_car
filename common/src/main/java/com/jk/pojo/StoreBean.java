package com.jk.pojo;

import java.io.Serializable;

/**
 * 类描述：车辆所在店铺表
 * 创建人：孙长江
 * 创建时间：2019/4/1619:32
 * 修改人：孙长江
 * 修改时间：2019/4/1619:32
 * 修改备注：
 */
public class StoreBean implements Serializable {

    private static final long serialVersionUID = -304309774325441785L;
    private Integer id;

    private String storName;//店铺名称

    private String storSite;// 店铺地址

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStorName() {
        return storName;
    }

    public void setStorName(String storName) {
        this.storName = storName;
    }

    public String getStorSite() {
        return storSite;
    }

    public void setStorSite(String storSite) {
        this.storSite = storSite;
    }
}
