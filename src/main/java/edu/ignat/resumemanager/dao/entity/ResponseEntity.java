package edu.ignat.resumemanager.dao.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "Responses")
public class ResponseEntity {

    @Id
    @GeneratedValue
    private long id;

    @NonNull
    @ManyToOne
    @JoinColumn(name = "company_fk")
    private CompanyEntity companyEntity;

    @NonNull
    private String vacancy;

    @NonNull
    private String description;

    @Temporal(TemporalType.DATE)
    @CreatedDate
    private LocalDate send;

    //TODO Not working
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "response_tag",
            joinColumns = {@JoinColumn(name = "fk_response")},
            inverseJoinColumns = {@JoinColumn(name = "fk_tag")})
    private Set<TagEntity> tags = new HashSet<>();

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

    public static void main(String[] args) {
        CompanyEntity company = new CompanyEntity("Sber");
        ResponseEntity response = new ResponseEntity(company, "Dev", "Java Middle");
        System.out.println(response);


    }

}
