package edu.ignat.resumemanager.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "Tags")
public class Tag {

    @Id
    @GeneratedValue
    private long id;

    @NonNull
    private String name;

    @ManyToMany(mappedBy = "tags")
    private Set<Response> tags = new HashSet<>();

}
