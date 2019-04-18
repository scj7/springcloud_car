package com.jk.dao;

import com.jk.pojo.TreeBean;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface NavDao {
    @Select("select id ,text,pid,url href from t_tree where pid = #{id}")
    List<TreeBean> getTree(int id);
}
