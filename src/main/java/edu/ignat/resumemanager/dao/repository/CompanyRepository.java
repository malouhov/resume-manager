package edu.ignat.resumemanager.dao.repository;

import edu.ignat.resumemanager.dao.entity.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<CompanyEntity, Long> {

}
