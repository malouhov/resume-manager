package edu.ignat.resumemanager.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "responses")
public class Response {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    @JoinColumn(name = "fk_company")
    private Company company;

    private String vacancy;

    private String description;

    private LocalDateTime send;

    @ManyToMany
    @JoinTable(name = "response_tag",
            joinColumns = {@JoinColumn(name = "fk_response")},
            inverseJoinColumns = {@JoinColumn(name = "fk_tag")})
    private Set<Tag> tags = new HashSet<>();

    @Enumerated(EnumType.ORDINAL)
    private Status status;

    public enum Status {

        SEND,
        TASK_RECEIVED,
        INTERVIEW,
        OFFER,
        REJECT

    }

}
