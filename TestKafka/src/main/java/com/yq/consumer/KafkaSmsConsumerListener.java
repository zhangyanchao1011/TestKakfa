package com.yq.consumer;

import java.io.UnsupportedEncodingException;

import org.json.JSONException;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Component;

/** 
 * Descript:kafka消费者监听
 * Author: zhangyc
 * Date: 2018年4月16日  
 */
@Component
public class KafkaSmsConsumerListener {
    
	 /**
     * 监听短信主题,有消息就读取
     * @param message
     * @throws UnsupportedEncodingException 
     * @throws JSONException 
     */
	@SuppressWarnings("unchecked")
	@KafkaListener(id = "sms", topicPartitions = { @TopicPartition(topic = "SMS", partitions = { "0","1" ,"2","3"}) })
    public void receiveConsumer(String message) throws Exception{
		System.out.println("7897686786867");
    }
}