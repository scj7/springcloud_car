package com.jk.dao;

import com.jk.pojo.CarBean;

import java.util.List;

/**
 * 类描述：
 * 创建人：王政
 * 创建时间：2019/4/18 14:05
 * 修改人：wz
 * 修改时间：2019/4/18 14:05
 * 修改备注：
 */
public interface CarDao {
    /**
     *  查询汽车总表总条数
     */
    long queryCount(CarBean carBean);
    /**
     *  查询汽车总表
     */
    List<CarBean> queryCar(long start, Integer rows, CarBean carBean);
}
