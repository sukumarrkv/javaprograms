package com.example.springbootandkafka.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.springbootandkafka.pojo.User;

@Service
public class KafkaJsonConsumer {

	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaJsonConsumer.class);
	
	@KafkaListener(topics="myjsontopic",groupId="myGroup")
	public void consumeJsonMessage(User user){
		LOGGER.info(String.format("Json message received is : %s", user.toString()));
	}
}
