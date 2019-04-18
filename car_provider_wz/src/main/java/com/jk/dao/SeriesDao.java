package com.jk.dao;

import com.jk.pojo.SeriesBean;

import java.util.List;

/**
 * 类描述：
 * 创建人：王政
 * 创建时间：2019/4/18 19:57
 * 修改人：wz
 * 修改时间：2019/4/18 19:57
 * 修改备注：
 */
public interface SeriesDao {
    /**
     *
     * 根据汽车品牌表Id查询 汽车系列表
     *  参数是 汽车品牌表的Id
     */
    List<SeriesBean> querySeries(Integer id);
}
