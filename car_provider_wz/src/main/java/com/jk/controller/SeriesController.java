package com.jk.controller;

import com.jk.pojo.SeriesBean;
import com.jk.service.SeriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 类描述：
 * 创建人：王政
 * 创建时间：2019/4/18 19:55
 * 修改人：wz
 * 修改时间：2019/4/18 19:55
 * 修改备注：
 */
@Controller
public class SeriesController {


    @Autowired
    private SeriesService seriesService;

    /**
     *
     * 根据汽车品牌表Id查询 汽车系列表
     *  参数是 汽车品牌表的Id
     */
    @RequestMapping("querySeries/{id}")
    @ResponseBody
    public List<SeriesBean> querySeries(@PathVariable Integer id){
        List<SeriesBean> list = seriesService.querySeries(id);
        return list;
    }


}
