package com.jk.service;

import com.jk.pojo.BrandBean;

import java.util.List;

/**
 * 类描述：
 * 创建人：王政
 * 创建时间：2019/4/18 19:34
 * 修改人：wz
 * 修改时间：2019/4/18 19:34
 * 修改备注：
 */
public interface BrandService {
    /**
     * 查询汽车品牌表
     */
    List<BrandBean> queryBrand();
}
