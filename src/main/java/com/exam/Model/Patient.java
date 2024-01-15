package com.exam.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int doctorId;
    private String name;
    private String surname;
    private int officeNo;

    @OneToMany(mappedBy = "doctor")
    private List<Patient> patients;

}
