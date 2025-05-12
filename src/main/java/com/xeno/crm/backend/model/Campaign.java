package com.xeno.crm.backend.model;
import jakarta.persistence.*;
import java.util.Date;
@Entity
public class Campaign {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Date startDate;
    private Date endDate;
}

