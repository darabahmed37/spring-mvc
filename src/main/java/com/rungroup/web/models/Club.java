package com.rungroup.web.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "club")
public class Club {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    public Long id;
    public String title;
    public String photoUrl;
    public String content;
    @CreationTimestamp
    public LocalDateTime createdOn;
    @UpdateTimestamp
    public LocalDateTime updatedOn;
}
