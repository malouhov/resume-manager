package edu.ignat.resumemanager.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Data
@RequiredArgsConstructor
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "Responses")
public class Response {

    @Id
    @GeneratedValue
    private long id;

    @NonNull
    @ManyToOne
    @JoinColumn(name = "fk_company")
    private Company company;

    @NonNull
    private String vacancy;

    @NonNull
    private String description;

    private LocalDateTime send = LocalDateTime.now();

    @ManyToMany
    @JoinTable(name = "response_tag",
            joinColumns = {@JoinColumn(name = "fk_response")},
            inverseJoinColumns = {@JoinColumn(name = "fk_tag")})
    private Set<Tag> tags = new HashSet<>();

    @Enumerated(EnumType.ORDINAL)
    private Status status = Status.NEW;

    public enum Status {

        NEW,
        SEND,
        TASK_RECEIVED,
        INTERVIEW,
        OFFER,
        REJECT

    }

}
