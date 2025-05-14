package com.springboot.s4.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "student")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, unique = true)
    private String password;

    @OneToOne(mappedBy = "student")
    @ToString.Exclude
    private StudentEntity studentEntity;

    @ManyToOne
    @JoinColumn(name = "class")
    @ToString.Exclude
    private StudentInfo studentInfo;
}
