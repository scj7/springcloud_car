package com.jk.controller;

import com.jk.pojo.TreeBean;
import com.jk.service.NavService;
import com.jk.utils.ConstantUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class NavController {

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private NavService navService;

    @ResponseBody
    @RequestMapping("findNav")
    public List<TreeBean> findNav(){
        List range = redisTemplate.opsForList().range(ConstantUtil.CACHE_NAV_KEY, 0, -1);
        List<TreeBean> list = new ArrayList<>();
        if (range != null && range.size() > 0){
            list = (List<TreeBean>) range.get(0);
        }else {
            list = navService.findNav();
            redisTemplate.opsForList().leftPush(ConstantUtil.CACHE_NAV_KEY, list);
        }
        return list;
    }
}
