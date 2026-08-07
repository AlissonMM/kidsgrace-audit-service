package edu.meialua.repository;

import edu.meialua.entity.AuditLog;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AuditLogRepository implements PanacheRepository<AuditLog> {
}
