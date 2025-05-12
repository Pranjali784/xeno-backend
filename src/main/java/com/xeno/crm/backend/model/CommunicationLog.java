package com.xeno.crm.backend.model;
import jakarta.persistence.*;

@Entity
public class CommunicationLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String channel;
    private String message;

    @ManyToOne
    private Customer customer;
}

