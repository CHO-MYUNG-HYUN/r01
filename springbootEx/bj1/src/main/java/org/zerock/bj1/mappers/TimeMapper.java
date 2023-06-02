package org.zerock.bj1.mappers;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TimeMapper {
    
    //@Select("select now()")
    String getTime();
}