package com.wuhenjian.aurora.rabbitmqservice.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 無痕剑
 * @date 2017/12/29 16:51
 */
@Configuration
public class TopicRabbitConfig {

	@Bean
	public Queue messageQueueA() {
		return new Queue("aurora.test");
	}

	@Bean
	public TopicExchange topicExchange() {
		return new TopicExchange("topicExchangeTest");
	}

	@Bean
	public Binding bindingMessageQueue() {
		return BindingBuilder.bind(this.messageQueueA()).to(this.topicExchange()).with("aurora.#");
	}
}
