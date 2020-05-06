package com.yuling.zhang.mqtt.config;

import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.integration.core.MessageProducer;
import org.springframework.integration.mqtt.core.DefaultMqttPahoClientFactory;
import org.springframework.integration.mqtt.core.MqttPahoClientFactory;
import org.springframework.integration.mqtt.inbound.MqttPahoMessageDrivenChannelAdapter;
import org.springframework.integration.mqtt.support.DefaultPahoMessageConverter;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHandler;
import org.springframework.messaging.MessagingException;

/**
 * @author zhangshixiang
 * @date 2020-05-06 15:27
 */
/*@Configuration
@IntegrationComponentScan*/
public class MqttReceiveConfig {

   /* @Value("${mqtt.username}")
    private String username;

    @Value("${mqtt.password}")
    private String password;

    @Value("${mqtt.url}")
    private String hostUrl;

    @Value("${mqtt.consumer.clientId}")
    private String clientId;

    @Value("${mqtt.consumer.defaultTopic}")
    private String defaultTopic;

    @Value("${mqtt.completionTimeout}")
    private int completionTimeout;

    @Bean
    public MqttConnectOptions getMqttConnect() {
        MqttConnectOptions mqttConnectOptions = new MqttConnectOptions();
        mqttConnectOptions.setUserName(username);
        mqttConnectOptions.setPassword(password.toCharArray());
        mqttConnectOptions.setServerURIs(new String[]{hostUrl});
        //心跳时间,单位秒
        mqttConnectOptions.setKeepAliveInterval(60);
        //自动重连
        mqttConnectOptions.setAutomaticReconnect(true);
        // 设置是否清空session,这里如果设置为false表示服务器会保留客户端的连接记录，
        mqttConnectOptions.setCleanSession(true);
        return mqttConnectOptions;
    }

    @Bean
    public MqttPahoClientFactory mqttFactory() {
        DefaultMqttPahoClientFactory factory = new DefaultMqttPahoClientFactory();
        factory.setConnectionOptions(getMqttConnect());
        return factory;
    }

    *//**
     * 接收通道
     * @return
     *//*
    @Bean
    public MessageChannel mqttInputChannel() {
        return new DirectChannel();
    }

    *//**
     * 配置client,监听的topic
     *//*
    @Bean
    public MessageProducer inbound() {
        MqttPahoMessageDrivenChannelAdapter adapter =
                new MqttPahoMessageDrivenChannelAdapter(clientId, mqttFactory(), defaultTopic);
        adapter.setCompletionTimeout(completionTimeout);
        adapter.setConverter(new DefaultPahoMessageConverter());
        adapter.setQos(1);
        adapter.setOutputChannel(mqttInputChannel());
        return adapter;
    }

    *//**
     * 通过通道获取数据
     *//*
    @Bean
    @ServiceActivator(inputChannel = "mqttOutboundChannel")
    public MessageHandler handler() {
        return new MessageHandler() {
            @Override
            public void handleMessage(Message<?> message) throws MessagingException {
                String topic = message.getHeaders().get("mqtt_topic").toString();
                String qos = message.getHeaders().get("mqtt_qos").toString();
                if (defaultTopic.equalsIgnoreCase(topic)) {
                    System.out.println("mqtt_qos:" + qos);
                    System.out.println("topic:" + topic);
                    System.out.println("payload:" + message.getPayload().toString());
                }
            }
        };
    }*/
}
