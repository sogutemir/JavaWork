package com.exam.Model;

import jakarta.persistence.*;

@Entity
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int patientId;
    private String name;
    private String surname;
    private String disease;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;
}
