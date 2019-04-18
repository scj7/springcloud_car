package com.jk.dao;

import com.jk.pojo.AreaBean;

import java.util.List;

/**
 * 类描述：
 * 创建人：王政
 * 创建时间：2019/4/18 18:45
 * 修改人：wz
 * 修改时间：2019/4/18 18:45
 * 修改备注：
 */
public interface AreaDao {
    /**
     * 查询地区表
     */
    List<AreaBean> queryArea();
}
