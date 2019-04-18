package com.jk.pojo;

import java.io.Serializable;

/**
 * 类描述： 汽车品牌表
 * 创建人：孙长江
 * 创建时间：2019/4/1619:37
 * 修改人：孙长江
 * 修改时间：2019/4/1619:37
 * 修改备注：
 */
public class BrandBean implements Serializable {

    private static final long serialVersionUID = 1693643356963189491L;
    private Integer id;

    private String brandName;//汽车品牌

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
