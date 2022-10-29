package com.example.springbootandkafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootandkafka.kafka.KafkaJsonProducer;
import com.example.springbootandkafka.kafka.KafkaProducer;
import com.example.springbootandkafka.pojo.User;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

	@Autowired
	private KafkaProducer kafkaProducer;
	
	@Autowired
	private KafkaJsonProducer kafkaJsonProducer;
	
	@GetMapping("/publish/{message}")
	public ResponseEntity<String> publishMessage(@PathVariable String message){
		kafkaProducer.sendMessage(message);
		return ResponseEntity.ok("Message sent to kafka");
	}
	
	@PostMapping("/jsonpublish")
	public ResponseEntity<String> publishJsonMessage(@RequestBody User user){
		kafkaJsonProducer.sendJsonMessage(user);
		return ResponseEntity.ok("Json message sent to kafka");
	}
}
