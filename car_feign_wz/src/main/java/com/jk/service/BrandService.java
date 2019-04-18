package com.jk.service;

import com.jk.pojo.BrandBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 类描述：
 * 创建人：王政
 * 创建时间：2019/4/18 19:42
 * 修改人：wz
 * 修改时间：2019/4/18 19:42
 * 修改备注：
 */
@FeignClient(value = "car-provider-wz")
public interface BrandService {


    /**
     * 查询汽车品牌表
     */
    @RequestMapping("queryBrand")
    List<BrandBean> queryBrand();

}
