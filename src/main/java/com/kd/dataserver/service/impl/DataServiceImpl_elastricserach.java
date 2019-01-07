package com.kd.dataserver.service.impl;

import com.kd.dataserver.domain.Log;
import com.kd.dataserver.domain.User;
//import com.kd.dataserver.repository.LogRepository;
//import com.kd.dataserver.repository.UserRepository;
import com.kd.dataserver.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: www.chuckfang.top
 * @Date: 2019/1/2 20:14
 */
@Service
public class DataServiceImpl_elastricserach implements DataService {
    
    /*@Autowired
    LogRepository logRepository;

    @Autowired
    UserRepository userRepository;*/

    @Override
    public boolean insert(Log log) {
//        User user = log.getUser();
//        Long userId = user.getId();
//        if (!userRepository.existsById(userId)) {//如果user表里面没有记录则插入
//            userRepository.save(user);
//        }
//        Log save = logRepository.save(log);
//
//        return save != null;
        return false;
    }
}
