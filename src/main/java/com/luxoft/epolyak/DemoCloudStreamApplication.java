package com.luxoft.epolyak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.core.MessageSource;
import org.springframework.integration.support.MessageBuilder;

import java.util.stream.Stream;

@EnableBinding(LogProcessor.class)
@SpringBootApplication
public class DemoCloudStreamApplication {

	public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoCloudStreamApplication.class, args);
        LogProcessor logProcessor = context.getBean(LogProcessor.class);
//        Stream.of("11111111", "2222222222", "3333333")
//                .forEach(text ->
//                        logProcessor.output().send(
//                                MessageBuilder.withPayload("Test " + text + " !!!").build()));

	}

    @StreamListener("log")
    public void handle(String message) {
        System.out.println("!!! Listener message  Message: [" + message + "]");
    }

//    @Bean
//    @InboundChannelAdapter(value = LogProcessor.CHANNEL, poller = @Poller(fixedDelay = "3000", maxMessagesPerPoll = "1"))
//    public MessageSource<String> logMessageSource() {
////        return () -> MessageBuilder.withPayload(new EventLog()).build();
//        return () ->
//        {
//            System.out.println("Sent a message !");
//            return MessageBuilder.withPayload("Test !!!").build();};
//    }
//	@Bean
//	@InboundChannelAdapter(value = Source.OUTPUT)
//	public MessageSource<String> timerMessageSource() {
//		return () -> new GenericMessage<>(
//		        new SimpleDateFormat().format(new Date()));
//	}
}
