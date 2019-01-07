package com.kd.dataserver.mapper;

import com.kd.dataserver.domain.User;
import org.springframework.stereotype.Repository;


@Repository
public interface UserMapper {

    int insert(User record);

    int insertSelective(User record);

    User selectById(Long id);

}