package com.jk.pojo;

import java.io.Serializable;

/**
 * 类描述：车主信息表
 * 创建人：孙长江
 * 创建时间：2019/4/1619:26
 * 修改人：孙长江
 * 修改时间：2019/4/1619:26
 * 修改备注：
 */
public class OwnerBean implements Serializable {

    private static final long serialVersionUID = -3424641365889171885L;
    private Integer id;

    private String  ownerName;//车主姓名

    private Long ownerPhone; //车主手机号

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Long getOwnerPhone() {
        return ownerPhone;
    }

    public void setOwnerPhone(Long ownerPhone) {
        this.ownerPhone = ownerPhone;
    }
}
