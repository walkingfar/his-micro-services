package com.silk.his.diagservice2.service;

/**
 * @Author qianyf
 * @Date 2021-08-11
 */

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.common.message.MessageExt;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * rocketmq 消息监听，@RocketMQMessageListener中的selectorExpression为tag，默认为*
 */
@Slf4j
@Component
@RocketMQMessageListener(topic = "queue_test_topic",selectorExpression="*",consumerGroup = "queue_group_test")
public class RocketMQMsgListener implements RocketMQListener<MessageExt> {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    @Override
    public void onMessage(MessageExt message) {
        byte[] body = message.getBody();
        String msg = new String(body);
        log.info("接收到消息：{}", msg);
    }

}