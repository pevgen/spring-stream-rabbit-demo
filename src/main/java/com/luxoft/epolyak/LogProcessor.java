package com.luxoft.epolyak;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;

/**
 * @author epolyak<at>luxoft.com
 * @since 03.07.2017.
 */
public interface LogProcessor {

    String CHANNEL = "myexchange";

    @Output(LogProcessor.CHANNEL)
    MessageChannel output();
}
