package com.kd.dataserver.service.impl;

import com.kd.dataserver.domain.Log;
import com.kd.dataserver.mapper.LogMapper;
import com.kd.dataserver.mapper.UserMapper;
import com.kd.dataserver.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 * @Author: www.chuckfang.top
 * @Date: 2018/12/26 19:48
 */
@Service
public class DataServiceImpl implements DataService {

    @Autowired
    LogMapper logMapper;

    @Autowired
    UserMapper userMapper;

    @Override
    public boolean insert(Log log) {
        if (userMapper.selectById(log.getUser().getId()) == null) {//如果user表里面没有记录则插入
            userMapper.insertSelective(log.getUser());
        }
        int i = logMapper.insertSelective(log);
        return i==1;
    }
}
