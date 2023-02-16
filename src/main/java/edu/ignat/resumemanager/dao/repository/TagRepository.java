package edu.ignat.resumemanager.dao.repository;

import edu.ignat.resumemanager.dao.entity.TagEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<TagEntity, Long> {

}
