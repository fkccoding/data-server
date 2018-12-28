package com.kd.dataserver;

import com.kd.dataserver.domain.Log;
import com.kd.dataserver.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.handler.annotation.SendTo;

@EnableBinding(Processor.class)
public class MsgSink {

    @Autowired
    DataService dataService;

	//TODO 监听input通道，然后存到数据库中

	@StreamListener(Processor.INPUT)
    @SendTo(Processor.OUTPUT)
	public boolean messageSink(Log log) {
		System.out.println("Received: " + log);
        boolean insert = dataService.insert(log);
        System.out.println("插入"+(insert?"成功":"失败"));
        return insert;
    }
}
