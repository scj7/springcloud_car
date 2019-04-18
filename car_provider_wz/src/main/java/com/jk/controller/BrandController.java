package com.jk.controller;

import com.jk.pojo.BrandBean;
import com.jk.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 类描述：
 * 创建人：王政
 * 创建时间：2019/4/18 19:31
 * 修改人：wz
 * 修改时间：2019/4/18 19:31
 * 修改备注：
 */
@Controller
public class BrandController {


    @Autowired
    private BrandService brandService;

    /**
     * 查询汽车品牌表
     */
    @RequestMapping("queryBrand")
    @ResponseBody
    public List<BrandBean> queryBrand(){
        List<BrandBean> list = brandService.queryBrand();
        return list;
    }


}
