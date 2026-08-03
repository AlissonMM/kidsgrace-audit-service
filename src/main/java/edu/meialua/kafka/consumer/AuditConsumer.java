package edu.meialua.kafka.consumer;

import edu.meialua.dto.LogEvent;
import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.reactive.messaging.Incoming;

@ApplicationScoped
public class AuditConsumer {

    // Receives the events from the channel "audit"
    // that is configured to listen to the "logs" topic in kafka
    // in the application.properties
    @Incoming("audit")
    public void consume(LogEvent logEvent) {
        System.out.println("Event Received: ");
        System.out.println(logEvent);
    }


}
