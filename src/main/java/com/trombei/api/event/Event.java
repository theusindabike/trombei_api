package com.trombei.api.event;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length=50, nullable=false)
    private String name;

    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date startDate;

    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date endDate;

    @Column(length=255)
    private String description;

    @Enumerated(EnumType.STRING)
    private EventStatus status;

    @CreatedDate
    private Date createdAt;

    public Event(String name) {
        this.name = name;
    }
}