package com.benjamin.springmvcstudy.model.vo;

/**
 * @author Ben.Li
 * @date 10/4/22 10:12 AM
 */
public class DemoVO {

    String result;

    SubDemoVO subDemoVO;

    public DemoVO() {
    }

    public DemoVO(String result, SubDemoVO subDemoVO) {
        this.result = result;
        this.subDemoVO = subDemoVO;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public SubDemoVO getSubDemoVO() {
        return subDemoVO;
    }

    public void setSubDemoVO(SubDemoVO subDemoVO) {
        this.subDemoVO = subDemoVO;
    }
}
