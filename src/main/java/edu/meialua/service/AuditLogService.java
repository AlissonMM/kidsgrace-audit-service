package edu.meialua.service;

import edu.meialua.entity.AuditLog;
import edu.meialua.repository.AuditLogRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class AuditLogService {

    private final AuditLogRepository repository;


    @Inject
    public AuditLogService(AuditLogRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public void save(AuditLog auditLog) {
        repository.persist(auditLog);
    }
}