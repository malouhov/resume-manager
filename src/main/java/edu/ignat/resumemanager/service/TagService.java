package edu.ignat.resumemanager.service;

import edu.ignat.resumemanager.dao.entity.TagEntity;

import java.util.List;
import java.util.Optional;

public interface TagService {

    /**
     *
     * @param tag
     * @return
     */
    TagEntity save(TagEntity tag);

    /**
     *
     * @param id
     * @return
     */
    TagEntity delete(long id);

    /**
     *
     * @param id
     * @return
     */
    Optional<TagEntity> findById(long id);

    /**
     *
     * @return
     */
    List<TagEntity> getAllTags();

}
