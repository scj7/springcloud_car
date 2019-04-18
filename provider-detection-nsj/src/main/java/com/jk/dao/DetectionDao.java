package com.jk.dao;

import com.jk.pojo.DetectionBean;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DetectionDao {


    @Select("select id,name as detectionName,pid from t_detection where pid = #{pid}")
    List<DetectionBean> queryDetectionByPid(@Param("pid") Integer pid);
}
