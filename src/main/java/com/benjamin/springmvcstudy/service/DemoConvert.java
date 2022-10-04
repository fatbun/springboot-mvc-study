package com.benjamin.springmvcstudy.service;


import com.benjamin.common.Page;
import com.benjamin.springmvcstudy.model.dto.DemoDTO;
import com.benjamin.springmvcstudy.model.entity.DemoEntity;
import com.benjamin.springmvcstudy.model.vo.DemoVO;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author liben
 */
@Mapper(componentModel = "spring")
public interface DemoConvert {

    DemoVO toVo(DemoEntity activity);

    List<DemoVO> toVo(List<DemoEntity> activity);

    Page<DemoVO> toVo(Page<DemoEntity> activity);

    DemoEntity toEntity(DemoDTO activityDTO);
}

