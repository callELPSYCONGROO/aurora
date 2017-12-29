package com.wuhenjian.aurora.rabbitmqservice.service.impl;

import com.wuhenjian.aurora.rabbitmqservice.service.ProducerService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 無痕剑
 * @date 2017/12/29 17:54
 */
@Service
public class ProducerServiceImpl implements ProducerService {

	@Autowired
	private RabbitTemplate rabbitTemplate;

	@Override
	public void send(String msg) {
		rabbitTemplate.convertAndSend("topicExchangeTest", "aurora.test", "hello");
	}
}
