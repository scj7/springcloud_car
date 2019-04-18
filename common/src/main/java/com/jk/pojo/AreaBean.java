package com.jk.pojo;

import java.io.Serializable;

/**
 * 类描述：
 * 创建人：孙长江
 * 创建时间：2019/4/1711:19
 * 修改人：孙长江
 * 修改时间：2019/4/1711:19
 * 修改备注：
 */
public class AreaBean implements Serializable {
    private static final long serialVersionUID = -4158523129967642668L;

    private Integer id;

    private String area; //地区

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
