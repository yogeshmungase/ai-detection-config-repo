package com.truthlens.ai.image_service.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "jobs")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DetectionJob {

    @Id
    private String id;

    private String jobId;

    private String fileName;

    private String status;

    private LocalDateTime createdAt;

}