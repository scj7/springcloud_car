package com.jk.pojo;

import java.io.Serializable;

/**
 * 类描述：用户表
 * 创建人：孙长江
 * 创建时间：2019/4/1619:24
 * 修改人：孙长江
 * 修改时间：2019/4/1619:24
 * 修改备注：
 */
public class UserBean implements Serializable {

    private static final long serialVersionUID = 8812395333261873783L;
    private Integer id;

    private Long phone;//手机号


    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

}
