package com.kd.dataserver.service.impl;

import com.kd.dataserver.domain.Log;
import com.kd.dataserver.domain.User;
import com.kd.dataserver.mapper.LogMapper;
import com.kd.dataserver.mapper.UserMapper;
import com.kd.dataserver.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


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


//    @Autowired
//    TLogMapper logMapper;
//
//    @Autowired
//    TUserMapper userMapper;

    @Override
    @Transactional
    public boolean insert(Log log) {
        User user = log.getUser();
        Long userId = user.getId();
        /*if (userId <= 0) {
            System.out.println("user_id = " + userId + "，userId不合法");
            return false;
        }*/
        if (userMapper.selectById(userId) == null) {//如果user表里面没有记录则插入
            userMapper.insert(user);
        }
//        int j = 1/0;
        int i = logMapper.insert(log);
        return i==1;
    }
}
