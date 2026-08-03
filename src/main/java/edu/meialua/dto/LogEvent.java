package edu.meialua.dto;

import edu.meialua.enums.Action;
import edu.meialua.enums.EntityType;

import java.time.LocalDateTime;

public class LogEvent {

    private Action action;

    private EntityType entity;

    private Long entityId;

    private String user;

    private String description;

    private LocalDateTime timestamp;

}