package com.kd.dataserver;

import com.kd.dataserver.domain.Log;
import com.kd.dataserver.service.impl.DataServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.handler.annotation.SendTo;


@EnableBinding(Processor.class)
@Slf4j
public class MsgSink {

    private Logger logger = LoggerFactory.getLogger(MsgSink.class);

    // TODO 后续可以读取配置文件的信息，来决定使用哪一个持久化层
    // 使用elastricsearch存储
//    @Autowired
//    DataServiceImpl_elastricserach dataService;

    // 使用MySQL存储
    @Autowired
    DataServiceImpl dataService;

//    @Autowired
//    ITUserService userService;
//
//    @Autowired
//    ITLogService logService;

	//TODO 监听input通道，然后存到数据库中
	@StreamListener(Processor.INPUT)
    @SendTo(Processor.OUTPUT)
	public boolean messageSink(Log log) {
        System.out.println("Received: " + log);
        boolean insert = dataService.insert(log);
        logger.info("插入"+(insert?"成功":"失败"));
        return insert;
    }
}
