package edu.ignat.resumemanager.dao.repository;

import edu.ignat.resumemanager.dao.entity.CompanyEntity;
import edu.ignat.resumemanager.dao.entity.ResponseEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.List;

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

    private final CompanyEntity expectedCompanyEntity = new CompanyEntity("Sberbank");
    private final CompanyEntity unexpectedCompanyEntity = new CompanyEntity("VTB");
    private final ResponseEntity expectedResponse01Entity = new ResponseEntity(expectedCompanyEntity, "Developer", "Middle Java");
    private final ResponseEntity expectedResponse02Entity = new ResponseEntity(expectedCompanyEntity, "Developer", "Java Senior");
    private final ResponseEntity unexpectedResponseEntity = new ResponseEntity(unexpectedCompanyEntity, "Manager", "Sales Department");

    @BeforeEach
    public void initDatabase() {
        entityManager.persist(expectedCompanyEntity);
        entityManager.persist(expectedResponse01Entity);
        entityManager.persist(expectedResponse02Entity);
        entityManager.persist(unexpectedCompanyEntity);
        entityManager.persist(unexpectedResponseEntity);
        entityManager.flush();
    }

    @Test
    @DisplayName("Search Vacancy successful test ")
    public void searchVacancySuccessfulTest() {

        String keyword = "Dev";
        List<ResponseEntity> actualResponses = responseRepository.search(keyword);
        assertThat(actualResponses).contains(expectedResponse01Entity, expectedResponse02Entity);

    }

    @Test
    @DisplayName("Search Description successful test ")
    public void searchDescriptionSuccessfulTest() {

        String keyword = "Middle";
        List<ResponseEntity> actualResponses = responseRepository.search(keyword);
        assertThat(actualResponses).contains(expectedResponse01Entity);

    }

    @Test
    @DisplayName("Search Company Different Case successful test ")
    public void searchCompanySuccessfulTest() {

        String keyword = "SBER";
        List<ResponseEntity> actualResponses = responseRepository.search(keyword);
        assertThat(actualResponses).contains(expectedResponse01Entity, expectedResponse02Entity);

    }

}