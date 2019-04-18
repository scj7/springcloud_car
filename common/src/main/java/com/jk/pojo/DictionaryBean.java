package com.jk.pojo;

import java.io.Serializable;

/**
 * 类描述：字典表
 * 创建人：孙长江
 * 创建时间：2019/4/1811:02
 * 修改人：孙长江
 * 修改时间：2019/4/1811:02
 * 修改备注：
 */
public class DictionaryBean implements Serializable {

    private static final long serialVersionUID = -6668242298130592455L;
    private Integer id;

    private Integer codeId;

    private String text;

    private Integer codePid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCodeId() {
        return codeId;
    }

    public void setCodeId(Integer codeId) {
        this.codeId = codeId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getCodePid() {
        return codePid;
    }

    public void setCodePid(Integer codePid) {
        this.codePid = codePid;
    }
}
