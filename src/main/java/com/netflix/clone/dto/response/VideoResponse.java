package com.netflix.clone.dto.response;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.event.WindowStateListener;
import java.time.Instant;
import java.util.List;

@Data
@NoArgsConstructor
public class VideoResponse {
    private long id;
    private String title;
    private String description;
    private Integer year;
    private String rating;

    private Integer duration;
    private String src;
    private String poster;
    private boolean published;

    private List<String> categories;
    private Instant createdAt;
    private Instant updatedAt;
    private Boolean isInWatchList;

    public VideoResponse(
            Long id,
            String title,
            String description,
            Integer year,
            String rating,
            Integer duration,
            String src,
            String poster,
            boolean published,
            List<String> categories,
            Instant createdAt,
            Instant updatedAt
    ){
        this.title = title;
        this.description = description;
        this.year = year;
        this.rating = rating;
        this.duration = duration;
        this.src = src;
        this.poster = poster;
        this.published = published;
        this.categories = categories;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
