package com.benjamin.springmvcstudy.model.entity;

import com.benjamin.springmvcstudy.model.vo.SubDemoVO;

/**
 * @author Ben.Li
 * @date 10/4/22 10:12 AM
 */
public class DemoEntity {

    String result;

    SubDemoEntity subDemoVO;

    public DemoEntity() {
    }

    public DemoEntity(String result, SubDemoEntity subDemoVO) {
        this.result = result;
        this.subDemoVO = subDemoVO;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public SubDemoEntity getSubDemoVO() {
        return subDemoVO;
    }

    public void setSubDemoVO(SubDemoEntity subDemoVO) {
        this.subDemoVO = subDemoVO;
    }
}
