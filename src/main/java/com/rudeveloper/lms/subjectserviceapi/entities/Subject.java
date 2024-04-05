package com.rudeveloper.lms.subjectserviceapi.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "subject")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private boolean status;



}
