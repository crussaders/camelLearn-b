package com.spring.camelLearn_b.routes;

import com.spring.camelLearn_b.CurrencyExchange;
import org.apache.camel.builder.RouteBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

//@Component
public class KafkaReceiverRouter extends RouteBuilder {

    @Override
    public void configure() throws Exception {

                from("kafka:my-kafka-topic")
                .to("log:received-message-from-Kafka");

    }
}




