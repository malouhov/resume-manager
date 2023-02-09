package edu.ignat.resumemanager.repository;

import edu.ignat.resumemanager.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
