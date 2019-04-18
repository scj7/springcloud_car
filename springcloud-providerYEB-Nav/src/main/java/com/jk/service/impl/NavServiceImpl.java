package com.jk.service.impl;

import com.jk.dao.NavDao;
import com.jk.pojo.TreeBean;
import com.jk.service.NavService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NavServiceImpl implements NavService {

    @Autowired
    private NavDao navDao;

    @Override
    public List<TreeBean> findNav() {
        int id = 0;
        List<TreeBean> treeNode = treeNode(id);
        return treeNode;
    }

    private List<TreeBean> treeNode(int id) {
        List<TreeBean> list = navDao.getTree(id);
        for (TreeBean treeBean : list) {
            List<TreeBean> childrens = treeNode(treeBean.getId());
            if (childrens != null && childrens.size() >0){
                treeBean.setNodes(childrens);
                treeBean.setSelectable(false);
            }else {
                treeBean.setSelectable(true);
            }
        }
        return list;
    }
}
