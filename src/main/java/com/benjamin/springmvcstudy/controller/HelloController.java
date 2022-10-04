package com.benjamin.springmvcstudy.controller;

import com.benjamin.springmvcstudy.model.dto.SubDemoDTO;
import com.benjamin.springmvcstudy.model.entity.DemoEntity;
import com.benjamin.springmvcstudy.model.entity.SubDemoEntity;
import com.benjamin.springmvcstudy.model.vo.DemoVO;
import com.benjamin.springmvcstudy.service.DemoConvert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {

    @Resource
    private DemoConvert demoConvert;

    @GetMapping("/hi")
    public String hi() {
        System.out.println("hi...");

        return "hi...";
    }

    @GetMapping("/mapstruct")
    public DemoVO mapstruct() {
        System.out.println("mapstruct...");

        SubDemoEntity subEntity = new SubDemoEntity("sub...");
        DemoEntity entity = new DemoEntity("mapstruct...", subEntity);

        return demoConvert.toVo(entity);
    }
}
