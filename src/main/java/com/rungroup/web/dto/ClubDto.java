package com.rungroup.web.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class ClubDto {
    public Long id;
    public String title;
    public String photoUrl;
    public String content;
    public LocalDateTime createdOn;
    public LocalDateTime updatedOn;
}
