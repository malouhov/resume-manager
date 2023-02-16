package edu.ignat.resumemanager.service;

import edu.ignat.resumemanager.dao.entity.CompanyEntity;
import edu.ignat.resumemanager.dao.entity.ResponseEntity;
import edu.ignat.resumemanager.dao.entity.TagEntity;

import java.util.List;
import java.util.Optional;

public interface ResponseService {

    /**
     *
     * @param response
     * @return
     */
    ResponseEntity save(ResponseEntity response);

    /**
     *
     * @param id
     * @return
     */
    ResponseEntity delete(long id);

    /**
     *
     * @param id
     * @param tag
     * @return
     */
    ResponseEntity setTag(long id, TagEntity tag);

    /**
     *
     * @param id
     * @param tag
     * @return
     */
    ResponseEntity removeTag(long id, TagEntity tag);

    /**
     *
     * @param id
     * @return
     */
    Optional<ResponseEntity> findById(long id);

    /**
     *
     * @return
     */
    List<ResponseEntity> getAllResponses();

    /**
     *
     * @param company
     * @return
     */
    List<ResponseEntity> getByCompany(CompanyEntity company);

    /**
     *
     * @param tag
     * @return
     */
    List<ResponseEntity> getByTag(TagEntity tag);


}
