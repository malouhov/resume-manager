package edu.ignat.resumemanager.dao.repository;

import edu.ignat.resumemanager.dao.entity.ResponseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ResponseRepository extends JpaRepository<ResponseEntity, Long> {

    /**
     * @param query
     * @return
     */
    @Query(value = "SELECT * FROM Responses r" +
            " INNER JOIN Companies c ON r.company_fk=c.company_id" +
            " WHERE r.vacancy ILIKE %:query%" +
            " OR r.description ILIKE %:query%" +
            " OR c.name ILIKE %:query%"
            , nativeQuery = true)
    List<ResponseEntity> search(@Param("query") String query);

}
