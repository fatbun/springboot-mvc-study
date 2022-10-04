package com.benjamin.springmvcstudy.model.entity;

/**
 * @author Ben.Li
 * @date 10/4/22 10:31 AM
 */
public class SubDemoEntity {

    private String subName;

    public SubDemoEntity() {
    }

    public SubDemoEntity(String subName) {
        this.subName = subName;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }
}
