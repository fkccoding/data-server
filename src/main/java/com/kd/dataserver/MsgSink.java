package com.kd.dataserver;

import com.kd.dataserver.domain.Log;
import com.kd.dataserver.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(Sink.class)
public class MsgSink {

    @Autowired
    DataService dataService;

	//TODO 监听input通道，然后存到数据库中

	@StreamListener(Sink.INPUT)
	public void messageSink(Log log) {
		System.out.println("Received: " + log);
        boolean insert = dataService.insert(log);
        System.out.println(insert?"插入成功":"插入失败");
    }
}
