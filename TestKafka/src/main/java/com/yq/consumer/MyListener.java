
package com.yq.consumer;

import java.util.List;
import java.util.Optional;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Component;

/**
 * Simple to Introduction
 * className: MyListener
 *
 * @author EricYang
 * @version 2018/5/12 18:33
 */
//@Component
public class MyListener {
    private static final String TPOIC = "EMAIL";

    @KafkaListener(id = "id0", topicPartitions = { @TopicPartition(topic = TPOIC, partitions = { "0" }) })
    public void listenPartition0(List<ConsumerRecord<?, ?>> records) {
        //System.out.println("Id0 Listener, Thread ID: " + Thread.currentThread().getId());
       System.out.println("Id0 records size " +  records.size());

        for (ConsumerRecord<?, ?> record : records) {
            Optional<?> kafkaMessage = Optional.ofNullable(record.value());
          // System.out.println("Received: " + record);
            if (kafkaMessage.isPresent()) {
                Object message = record.value();
                String topic = record.topic();
               //System.out.println("p0 Received message={}"+  message);
            }
        }
    }

    @KafkaListener(id = "id1", topicPartitions = { @TopicPartition(topic = TPOIC, partitions = { "1" }) })
    public void listenPartition1(List<ConsumerRecord<?, ?>> records) {
       //System.out.println("Id1 Listener, Thread ID: " + Thread.currentThread().getId());
       System.out.println("Id1 records size " +  records.size());

        for (ConsumerRecord<?, ?> record : records) {
            Optional<?> kafkaMessage = Optional.ofNullable(record.value());
           //System.out.println("Received: " + record);
            if (kafkaMessage.isPresent()) {
                Object message = record.value();
                String topic = record.topic();
              // System.out.println("p1 Received message={}"+  message);
            }
        }
    }

    @KafkaListener(id = "id2", topicPartitions = { @TopicPartition(topic = TPOIC, partitions = { "2" }) })
    public void listenPartition2(List<ConsumerRecord<?, ?>> records) {
      // System.out.println("Id2 Listener, Thread ID: " + Thread.currentThread().getId());
       System.out.println("Id2 records size " +  records.size());

        for (ConsumerRecord<?, ?> record : records) {
            Optional<?> kafkaMessage = Optional.ofNullable(record.value());
          // System.out.println("Received: " + record);
            if (kafkaMessage.isPresent()) {
                Object message = record.value();
                String topic = record.topic();
               //System.out.println("p2 Received message={}"+  message);
            }
        }
    }

    @KafkaListener(id = "id3", topicPartitions = { @TopicPartition(topic = TPOIC, partitions = { "3" }) })
    public void listenPartition3(List<ConsumerRecord<?, ?>> records) {
      // System.out.println("Id3 Listener, Thread ID: " + Thread.currentThread().getId());
       System.out.println("Id3 records size " + records.size());

        for (ConsumerRecord<?, ?> record : records) {
            Optional<?> kafkaMessage = Optional.ofNullable(record.value());
           //System.out.println("Received: " + record);
            if (kafkaMessage.isPresent()) {
                Object message = record.value();
                String topic = record.topic();
               //System.out.println("p3 Received message={}"+message);
            }
        }
    }
}
