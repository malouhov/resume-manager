package edu.ignat.resumemanager.repository;

import edu.ignat.resumemanager.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Long> {

}
