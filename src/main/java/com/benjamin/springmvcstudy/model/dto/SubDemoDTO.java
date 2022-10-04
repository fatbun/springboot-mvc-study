package com.benjamin.springmvcstudy.model.dto;

/**
 * @author Ben.Li
 * @date 10/4/22 10:31 AM
 */
public class SubDemoDTO {

    private String subName;

    public SubDemoDTO() {
    }

    public SubDemoDTO(String subName) {
        this.subName = subName;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }
}
