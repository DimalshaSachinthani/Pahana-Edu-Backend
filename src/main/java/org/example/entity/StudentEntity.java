package org.example.entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table (name = "student")

public class StudentEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer studentId;
    private String name;
    private String address;
}
