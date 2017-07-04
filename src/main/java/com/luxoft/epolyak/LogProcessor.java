package com.luxoft.epolyak;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author epolyak<at>luxoft.com
 * @since 03.07.2017.
 */
public interface LogProcessor {

    String CHANNEL = "log";

    @Output(LogProcessor.CHANNEL)
    MessageChannel output();

    @Input(LogProcessor.CHANNEL)
    SubscribableChannel input();
}
