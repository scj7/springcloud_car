package com.jk.serviceimpl;

import com.jk.dao.SeriesDao;
import com.jk.pojo.SeriesBean;
import com.jk.service.SeriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 类描述：
 * 创建人：王政
 * 创建时间：2019/4/18 19:56
 * 修改人：wz
 * 修改时间：2019/4/18 19:56
 * 修改备注：
 */
@Service
public class SeriesServiceImpl implements SeriesService {


    @Autowired
    private SeriesDao seriesDao;

    /**
     *
     * 根据汽车品牌表Id查询 汽车系列表
     *  参数是 汽车品牌表的Id
     */
    @Override
    public List<SeriesBean> querySeries(Integer id) {
        return seriesDao.querySeries(id);
    }
}
