package com.spring.start.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StartMapper {

    String getTime();
}
