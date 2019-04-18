package com.jk.service;

import com.jk.pojo.SeriesBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 类描述：
 * 创建人：王政
 * 创建时间：2019/4/18 20:07
 * 修改人：wz
 * 修改时间：2019/4/18 20:07
 * 修改备注：
 */
@FeignClient(value = "car-provider-wz")
public interface SeriesService {

    /**
     *
     * 根据汽车品牌表Id查询 汽车系列表
     *  参数是 汽车品牌表的Id
     */
    @RequestMapping("querySeries/{id}")
    List<SeriesBean> querySeries(@PathVariable Integer id);
}
