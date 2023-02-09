package edu.ignat.resumemanager.repository;

import edu.ignat.resumemanager.model.Company;
import edu.ignat.resumemanager.model.Response;
import edu.ignat.resumemanager.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ResponseRepository extends JpaRepository<Response, Long> {
    @Query(value = "SELECT r FROM Responses r"
            + " WHERE r.company LIKE %:query%"
            + " OR WHERE r.vacancy LIKE %:query%"
            + " OR WHERE r.description LIKE %:query%", nativeQuery = true)
    List<Response> search(@Param("query") String query);
}
