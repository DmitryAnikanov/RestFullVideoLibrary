package com.restprojects.videolibrary.service;

import com.restprojects.videolibrary.entities.VideoFile;
import com.restprojects.videolibrary.repository.VideoFileRepository;
import com.restprojects.videolibrary.service.definition.VideoFileService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class VideoFileServiceImpl implements VideoFileService {

    @Autowired
    private final VideoFileRepository videoFileRepository;

    public VideoFileServiceImpl(VideoFileRepository videoFileRepository) {
        this.videoFileRepository = videoFileRepository;
    }

    @Override
    public void saveVideoFile(VideoFile file) {

    }

    @Override
    public void updateVideoFile(Integer id, String name, String genre, Integer rating) {

    }

    @Override
    public void deleteVideoFile(Integer id) {

    }

    @Override
    public VideoFile getVideoFileById(Integer id) {
        return null;
    }

    @Override
    public List<VideoFile> findAll() {
        return null;
    }

    @Override
    public List<VideoFile> getByName(String name) {
        return null;
    }

    @Override
    public List<VideoFile> getByGenre(String genre) {
        return null;
    }

    @Override
    public List<VideoFile> getByRating(String genre) {
        return null;
    }
}
