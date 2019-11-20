package com.restprojects.videolibrary.service.definition;


import com.restprojects.videolibrary.entities.VideoFile;

import java.util.List;

public interface VideoFileService {

    void saveVideoFile(VideoFile file);
    void updateVideoFile(Integer id, String name, String genre, Integer rating);
    void deleteVideoFile(Integer id);
    VideoFile getVideoFileById(Integer id);
    List<VideoFile> findAll();
    List<VideoFile> getByName(String name);
    List<VideoFile> getByGenre(String genre);
    List<VideoFile> getByRating(String genre);
}
