package edu.ignat.resumemanager.dao.entity;

import edu.ignat.resumemanager.dao.repository.ResponseRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class ResponseEntityTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private ResponseRepository responseRepository;

    @Test
    @DisplayName("Response entiti save success test")
    public void saveTest() {

        CompanyEntity sber = new CompanyEntity("Sber");
        ResponseEntity response = new ResponseEntity(sber, "Dev", "Java Middle");


        System.out.println(response);
        ResponseEntity saved = responseRepository.save(response);
        System.out.println(saved);


    }


}