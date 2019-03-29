package com.yq.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Component;

/** 
 * Descript:kafka消费者监听
 * Author: zhangyc
 * Date: 2018年4月16日  
 */
@Component
public class KafkaEmailConsumerListener {
	
    
	 /**
     * 监听邮件主题,有消息就读取
     * @param message
     * @throws UnsupportedEncodingException 
     * @throws JSONException 
     */
	//@KafkaListener(topics = {"EMAIL"})
	@KafkaListener(id = "p0", topicPartitions = { @TopicPartition(topic = "EMAIL", partitions = { "0" }) })
    public void receiveConsumer0(String message) throws Exception{
		consumMes(message,0);
    }
	
	@KafkaListener(id = "p1", topicPartitions = { @TopicPartition(topic = "EMAIL", partitions = { "1" }) })
    public void receiveConsumer1(String message) throws Exception{
		consumMes(message,1);
    }
	
	@KafkaListener(id = "p2", topicPartitions = { @TopicPartition(topic = "EMAIL", partitions = { "2" }) })
    public void receiveConsumer2(String message) throws Exception{
		consumMes(message,2);
    }
	
	@KafkaListener(id = "p3", topicPartitions = { @TopicPartition(topic = "EMAIL", partitions = { "3" }) })
    public void receiveConsumer3(String message) throws Exception{
		consumMes(message,3);
    }
	
	/**
	 * 具体方法
	 * @param message 消息
	 * @param partition 分区
	 */
	public void consumMes(String message,int partition){
		System.out.println(partition+"----------"+message);
	}
	
	
	
	
	public static void main(String[] args) {
		String s = "15e5af73-7287-413a-8582-e84bf32c980d-Ecif&CCH架构图.doc";
		System.out.println(s.length());
		s = s.substring(37, s.length());
		System.out.println(s);
	}
}