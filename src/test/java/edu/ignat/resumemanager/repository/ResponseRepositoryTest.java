package edu.ignat.resumemanager.repository;

import edu.ignat.resumemanager.model.Company;
import edu.ignat.resumemanager.model.Response;
import edu.ignat.resumemanager.model.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class ResponseRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private ResponseRepository responseRepository;

    @Autowired
    private TagRepository tagRepository;

    @Autowired
    private CompanyRepository companyRepository;

    @Test
    @DisplayName("Empty repository success test")
    public void shouldFindNoResponsesInEmptyRepository() {
        List<Response> responses = responseRepository.findAll();
        assertThat(responses).isEmpty();
    }

    @Test
    public void shouldSaveAResponse() {

        Tag tagGood  = tagRepository.save(new Tag("good"));
        Tag tagStable  = tagRepository.save(new Tag("stable"));
        Company companySber = companyRepository.save(new Company("Sber"));
        Response response = responseRepository.save(new Response(companySber, "developer", "Java developer", Set.of(tagGood, tagStable)));
        assertThat(response).hasFieldOrPropertyWithValue("company", "Sber");

    }


}