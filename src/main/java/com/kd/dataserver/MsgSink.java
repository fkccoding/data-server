package com.kd.dataserver;

import com.kd.dataserver.domain.Log;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(Sink.class)
public class MsgSink {
	@StreamListener(Sink.INPUT)
	public void messageSink(Log log) {
		System.out.println("Received: " + log);
	}
}
