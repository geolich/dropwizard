package io.dropwizard.logging.async;

import ch.qos.logback.classic.AsyncAppender;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.AsyncAppenderBase;

/**
 * An implementation of {@link AsyncAppenderFactory} for {@link ILoggingEvent}.
 */
public class AsyncLoggingEventAppenderFactory implements AsyncAppenderFactory<ILoggingEvent> {

    /**
     * Creates an {@link AsyncAppenderBase} of type {@link ILoggingEvent}
     * @return the {@link AsyncAppenderBase}
     */
    @Override
    public AsyncAppenderBase<ILoggingEvent> build() {
        return new AsyncAppender();
    }
}
