package com.jk.service;

import com.jk.pojo.DetectionBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "provider-detection")
public interface DetectionService {

    @RequestMapping("queryDetectionByPid")
    List<DetectionBean> queryDetectionByPid(@RequestParam Integer pid);
}
