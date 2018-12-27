package com.kd.dataserver.mapper;

import com.kd.dataserver.domain.Log;
import com.kd.dataserver.domain.LogExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface LogMapper {
    long countByExample(LogExample example);

    int deleteByExample(LogExample example);

    int insert(Log record);

    int insertSelective(Log record);

    List<Log> selectByExample(LogExample example);

    int updateByExampleSelective(@Param("record") Log record, @Param("example") LogExample example);

    int updateByExample(@Param("record") Log record, @Param("example") LogExample example);
}