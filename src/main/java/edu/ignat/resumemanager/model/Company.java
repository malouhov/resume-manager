package edu.ignat.resumemanager.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "companies")
public class Company {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    @OneToMany(mappedBy = "company")
    private Set<Response> responses = new HashSet<>();

}
