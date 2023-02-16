package edu.ignat.resumemanager.dao.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "Companies")
public class CompanyEntity {

    @Id
    @GeneratedValue
    @Column(name = "company_id")
    private long id;

    @NonNull
    private String name;

    @OneToMany(mappedBy = "companyEntity", fetch = FetchType.LAZY)
    private Set<ResponseEntity> responses = new HashSet<>();

}
