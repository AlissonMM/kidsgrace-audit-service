package edu.meialua.mapper;

import edu.meialua.dto.LogEvent;
import edu.meialua.entity.AuditLog;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AuditLogMapper {

    public AuditLog toEntity(LogEvent logEvent) {

        return AuditLog.builder()
                .action(logEvent.getAction())
                .entity(logEvent.getEntity())
                .entityId(logEvent.getEntityId())
                .user(logEvent.getUser())
                .description(logEvent.getDescription())
                .timestamp(logEvent.getTimestamp())
                .build();

    }
}
