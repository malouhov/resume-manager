package edu.ignat.resumemanager.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "tags")
public class Tag {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    @ManyToMany(mappedBy = "tags")
    private Set<Response> tags = new HashSet<>();

}
