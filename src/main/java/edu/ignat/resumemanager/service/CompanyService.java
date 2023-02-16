package edu.ignat.resumemanager.service;

import edu.ignat.resumemanager.dao.entity.CompanyEntity;

import java.util.List;
import java.util.Optional;

public interface CompanyService {

    /**
     *
     * @param company
     * @return
     */
    CompanyEntity save(CompanyEntity company);

    /**
     *
     * @param id
     * @return
     */
    CompanyEntity delete(long id);

    /**
     *
     * @param id
     * @return
     */
    Optional<CompanyEntity> findById(long id);

    /**
     *
     * @return
     */
    List<CompanyEntity> getAllCompany();

}
