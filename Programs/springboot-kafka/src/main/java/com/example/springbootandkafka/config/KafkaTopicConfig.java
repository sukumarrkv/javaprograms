package com.example.springbootandkafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

	@Bean
	public NewTopic myTopic(){
		return TopicBuilder.name("mytopic").build();
	}
	
	@Bean
	public NewTopic myJsonTopic(){
		return TopicBuilder.name("myjsontopic").build();
	}
}
