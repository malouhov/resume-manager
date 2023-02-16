package edu.ignat.resumemanager.dao.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "Tags")
public class TagEntity {

    @Id
    @GeneratedValue
    private long id;

    @NonNull
    private String name;

    @ManyToMany(mappedBy = "tags")
    private Set<ResponseEntity> tags = new HashSet<>();

}
