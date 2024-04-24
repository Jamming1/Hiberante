package com.example.Hiberante.Entities;
import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table
@Data

public class Class extends BaseEntityData{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false, name = "Title")
    private String title;
    @Column(nullable = false, name = "Description")
    private String description;
}