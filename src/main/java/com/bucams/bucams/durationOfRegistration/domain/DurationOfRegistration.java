package com.bucams.bucams.durationOfRegistration.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

import java.time.LocalDateTime;

@Entity
@Getter
public class DurationOfRegistration {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dor-id")
    private Long id;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

}
