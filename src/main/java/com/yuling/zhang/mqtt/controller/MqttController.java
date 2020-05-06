package com.yuling.zhang.mqtt.controller;

import com.yuling.zhang.mqtt.constants.Constants;
import com.yuling.zhang.mqtt.server.IMqttSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangshixiang
 * @date 2020-05-06 14:50
 */
@RestController
@RequestMapping("/mq")
public class MqttController {

    @Autowired
    private IMqttSender mqttSender;

    @PostMapping("/sendTest")
    public String sendTest(@RequestBody(required = false) String payload) {
        if (payload == null) {
            payload = "没有内容";
        }
        mqttSender.sendToMqtt(Constants.DEFAULTOPIC, 1, payload);
        return "success";
    }
}
