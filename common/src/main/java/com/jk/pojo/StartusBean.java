package com.jk.pojo;

import java.io.Serializable;

/**
 * 类描述：
 * 创建人：孙长江
 * 创建时间：2019/4/1818:30
 * 修改人：孙长江
 * 修改时间：2019/4/1818:30
 * 修改备注：
 */
public class StartusBean implements Serializable {

    private static final long serialVersionUID = -2233165185021104750L;
    private  Integer id;

    private Integer startus=3;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStartus() {
        return startus;
    }

    public void setStartus(Integer startus) {
        this.startus = startus;
    }
}
