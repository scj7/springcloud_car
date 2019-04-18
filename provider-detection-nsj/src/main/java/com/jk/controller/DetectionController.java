package com.jk.controller;

import com.jk.dao.DetectionDao;
import com.jk.pojo.DetectionBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DetectionController {

    @Autowired
    private DetectionDao detectionDao;

    @RequestMapping("queryDetectionByPid")
    @ResponseBody
    public List<DetectionBean> queryDetectionByPid(@RequestParam Integer pid){
        return detectionDao.queryDetectionByPid(pid);
    }
}
