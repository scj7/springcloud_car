package com.jk.dao;

import com.jk.pojo.BrandBean;

import java.util.List;

/**
 * 类描述：
 * 创建人：王政
 * 创建时间：2019/4/18 19:35
 * 修改人：wz
 * 修改时间：2019/4/18 19:35
 * 修改备注：
 */
public interface BrandDao {
    /**
     * 查询汽车品牌表
     */
    List<BrandBean> queryBrand();
}
