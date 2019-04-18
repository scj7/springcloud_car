package com.jk.controller;

import com.jk.pojo.AreaBean;
import com.jk.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 类描述：
 * 创建人：王政
 * 创建时间：2019/4/18 18:55
 * 修改人：wz
 * 修改时间：2019/4/18 18:55
 * 修改备注：
 */
@Controller
@RequestMapping("Area")
public class AreaController {



    @Autowired
    private AreaService areaService;


    /**
     * 查询地区表
     */
    @RequestMapping("queryArea")
    @ResponseBody
    public List<AreaBean> queryArea(){
        List<AreaBean> list = areaService.queryArea();
        return list;
    }

}
