package com.yq.controller;

import com.alibaba.fastjson.JSONObject;
import com.yq.producer.ProducerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * Simple to Introduction
 * className: ProducerController
 *
 * @author yqbjtu
 * @version 2018/4/27 8:57
 */
@RestController
@RequestMapping(value = "/producer")
public class ProducerController {
    @Autowired
    ProducerService producerService;

    private static final Logger logger = LoggerFactory.getLogger(ProducerController.class);

    @RequestMapping(value = "/send", produces = "application/json;charset=UTF-8")
    public String sendMsg(@RequestParam  String topic, @RequestParam String content,@RequestParam int count) {
        logger.info("enter sendMsg, topic={}, content={}", topic, content);
        producerService.send(topic, content, count);

        JSONObject jsonObj = new JSONObject();
        jsonObj.put("currentTime", LocalDateTime.now().toString());
        return jsonObj.toJSONString();
    }

    @PostMapping(value = "/devMsg", produces = "application/json;charset=UTF-8")
    public String createDeviceMsg(@RequestParam  String topic, @RequestParam int count, @RequestParam String deviceId) {
        producerService.send(topic, deviceId, count);
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("currentTime", LocalDateTime.now().toString());
        return jsonObj.toJSONString();
    }

    @PostMapping(value = "/devJsonMsg", produces = "application/json;charset=UTF-8")
    public String createDeviceJsonMsg(@RequestParam String topic, @RequestParam int count, @RequestBody String jsonStr) {
        producerService.sendJson(topic, jsonStr, count);
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("currentTime", LocalDateTime.now().toString());
        return jsonObj.toJSONString();
    }
}
