package com.jk.serviceimpl;

import com.jk.dao.AreaDao;
import com.jk.pojo.AreaBean;
import com.jk.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 类描述：
 * 创建人：王政
 * 创建时间：2019/4/18 18:44
 * 修改人：wz
 * 修改时间：2019/4/18 18:44
 * 修改备注：
 */
@Service
public class AreaServiceImpl implements AreaService {


    @Autowired
    private AreaDao areaDao;

    /**
     * 查询地区表
     */
    @Override
    public List<AreaBean> queryArea() {

        return areaDao.queryArea();
    }
}
