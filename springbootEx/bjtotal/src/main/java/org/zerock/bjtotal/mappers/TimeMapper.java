package org.zerock.bjtotal.mappers;

import org.apache.ibatis.annotations.Mapper;


public interface TimeMapper {
    
    //@Select("select now()")
    String getTime();
}
