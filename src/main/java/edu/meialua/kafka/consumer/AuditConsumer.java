package edu.meialua.kafka.consumer;

import edu.meialua.dto.LogEvent;
import io.smallrye.common.annotation.Blocking;
import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.reactive.messaging.Incoming;

@ApplicationScoped
public class AuditConsumer {

    // Receives the events from the channel "audit"
    // that is configured to listen to the "logs" topic in kafka
    // in the application.properties
    @Incoming("audit")
    // Moves the execution from the reactive event loop to a worker thread,
    // allowing blocking operations (e.g., database access) without blocking
    // the processing of other incoming Kafka messages.
    @Blocking
    public void consume(LogEvent logEvent) {
        System.out.println("Event Received: ");
        System.out.println(logEvent);
    }


}
