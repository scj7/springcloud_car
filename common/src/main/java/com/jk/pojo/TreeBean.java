package com.jk.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * 类描述：树表
 * 创建人：孙长江
 * 创建时间：2019/4/1710:02
 * 修改人：孙长江
 * 修改时间：2019/4/1710:02
 * 修改备注：
 */
public class TreeBean implements Serializable {

    private static final long serialVersionUID = 3094046272661037618L;
    private Integer id;

    private String href; //节点路径

    private String text;//节点名称

    private Integer pid;//父节点

    private List<TreeBean> nodes; //

    private Boolean selectable;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public List<TreeBean> getNodes() {
        return nodes;
    }

    public void setNodes(List<TreeBean> nodes) {
        this.nodes = nodes;
    }

    public Boolean getSelectable() {
        return selectable;
    }

    public void setSelectable(Boolean selectable) {
        this.selectable = selectable;
    }
}