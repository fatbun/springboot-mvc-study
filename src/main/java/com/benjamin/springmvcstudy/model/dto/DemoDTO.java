package com.benjamin.springmvcstudy.model.dto;

import com.benjamin.springmvcstudy.model.vo.SubDemoVO;

/**
 * @author Ben.Li
 * @date 10/4/22 10:12 AM
 */
public class DemoDTO {

    String result;

    SubDemoDTO subDemoVO;

    public DemoDTO() {
    }

    public DemoDTO(String result, SubDemoDTO subDemoVO) {
        this.result = result;
        this.subDemoVO = subDemoVO;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public SubDemoDTO getSubDemoVO() {
        return subDemoVO;
    }

    public void setSubDemoVO(SubDemoDTO subDemoVO) {
        this.subDemoVO = subDemoVO;
    }
}
