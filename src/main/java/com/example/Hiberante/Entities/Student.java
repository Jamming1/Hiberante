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

public class Student extends BaseEntityData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false, name = "First name")
    private String firstName;
    @Column(nullable = false, name = "Last name")
    private String lastName;
    @Column(unique = true,name = "userEmail")
    private String email;
}
