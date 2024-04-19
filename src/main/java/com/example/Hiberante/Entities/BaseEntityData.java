package com.example.Hiberante.Entities;

import jakarta.persistence.MappedSuperclass;

import java.time.LocalDateTime;
@MappedSuperclass
public class BaseEntityData {

    private LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime updatedAt;

}
