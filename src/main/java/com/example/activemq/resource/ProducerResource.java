package com.example.activemq.resource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Queue;

@RestController
@RequestMapping("/rest/publish")
public class ProducerResource {

    JmsTemplate jmsTemplate;
    Queue queue;

    public ProducerResource(JmsTemplate jmsTemplate, Queue queue) {
        this.jmsTemplate = jmsTemplate;
        this.queue = queue;
    }

    @Qualifier("standalone.queue")
    @GetMapping("/{message}")
    public String publish (@PathVariable("message")
                               final String message){
        jmsTemplate.convertAndSend(queue, message);
        return "Published succesfully";
    }
}
