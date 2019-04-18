package com.jk.pojo;

import java.io.Serializable;

/**
 * 类描述：问题与回答表
 * 创建人：孙长江
 * 创建时间：2019/4/1619:45
 * 修改人：孙长江
 * 修改时间：2019/4/1619:45
 * 修改备注：
 */
public class IssueBean implements Serializable {

    private static final long serialVersionUID = 2309902695861840596L;
    private Integer id;

    private String issue;

    private String answer;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
