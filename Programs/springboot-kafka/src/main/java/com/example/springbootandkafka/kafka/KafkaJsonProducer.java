package com.example.springbootandkafka.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.example.springbootandkafka.pojo.User;

@Service
public class KafkaJsonProducer {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaJsonProducer.class);

	@Autowired
	private KafkaTemplate<String, User> kafkaTemplate;
	
	public void sendJsonMessage(User user){
		LOGGER.info(String.format("Message sent is : %s", user.toString()));
		Message<User> message = MessageBuilder.withPayload(user).setHeader(KafkaHeaders.TOPIC, "myjsontopic").build();
		kafkaTemplate.send(message);
	}
}
