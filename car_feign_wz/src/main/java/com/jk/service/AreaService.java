package com.jk.service;

import com.jk.pojo.AreaBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 类描述：
 * 创建人：王政
 * 创建时间：2019/4/18 18:56
 * 修改人：wz
 * 修改时间：2019/4/18 18:56
 * 修改备注：
 */
@FeignClient(value = "car-provider-wz")
public interface AreaService {



    /**
     * 查询地区表
     */
    @RequestMapping("queryArea")
    List<AreaBean> queryArea();


}
