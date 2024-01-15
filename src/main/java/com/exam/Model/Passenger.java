package com.exam.Model;


import jakarta.persistence.*;
@Entity
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String surname;
    @ManyToOne
    @JoinColumn(name = "bus_id")
    private Bus bus;
}