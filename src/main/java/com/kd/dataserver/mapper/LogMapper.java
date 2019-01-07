package com.kd.dataserver.mapper;

import com.kd.dataserver.domain.Log;
import org.springframework.stereotype.Repository;

@Repository
public interface LogMapper {

    int insert(Log record);

    int insertSelective(Log record);

}