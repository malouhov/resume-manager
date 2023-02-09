package edu.ignat.resumemanager.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Data
@RequiredArgsConstructor
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "Companies")
public class Company {

    @Id
    @GeneratedValue
    private long id;

    @NonNull
    private String name;

    @OneToMany(mappedBy = "company")
    private Set<Response> responses = new HashSet<>();

}
