package com.example.Hiberante.Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Table
@Data
@Entity
public class Enrollments extends BaseEntityData{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany
    private List<Student> students;

    @ManyToOne
    private Class classOne;
}
