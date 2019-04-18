package com.jk.controller;

import com.jk.pojo.DetectionBean;
import com.jk.service.DetectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DetectionController {

    @Autowired
    private DetectionService detectionService;

    @RequestMapping("queryDetectionByPid")
    public List<DetectionBean> queryDetectionByPid(Integer pid){
        return detectionService.queryDetectionByPid(pid);
    }
}
