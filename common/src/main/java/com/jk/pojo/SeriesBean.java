package com.jk.pojo;

import java.io.Serializable;

/**
 * 类描述：车辆系列表
 * 创建人：孙长江
 * 创建时间：2019/4/1619:42
 * 修改人：孙长江
 * 修改时间：2019/4/1619:42
 * 修改备注：
 */
public class SeriesBean implements Serializable {

    private static final long serialVersionUID = -1408419024815546587L;
    private Integer id;

    private String seriesName;//车辆系列名称

    private Integer brandId;//车辆品牌ID

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }
}
