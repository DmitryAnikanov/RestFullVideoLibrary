package com.restprojects.videolibrary.repository;

import com.restprojects.videolibrary.entities.VideoFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoFileRepository extends JpaRepository<VideoFile, Long> {
}
