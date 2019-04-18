package com.jk.serviceimpl;

import com.jk.dao.BrandDao;
import com.jk.pojo.BrandBean;
import com.jk.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 类描述：
 * 创建人：王政
 * 创建时间：2019/4/18 19:34
 * 修改人：wz
 * 修改时间：2019/4/18 19:34
 * 修改备注：
 */
@Service
public class BrandServiceImpl implements BrandService {


    @Autowired
    private BrandDao brandDao;

    /**
     * 查询汽车品牌表
     */
    @Override
    public List<BrandBean> queryBrand() {
        return brandDao.queryBrand();
    }
}
