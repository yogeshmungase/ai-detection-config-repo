package com.truthlens.ai.image_service.service;

import com.truthlens.ai.image_service.dto.UploadResponse;
import com.truthlens.ai.image_service.entity.DetectionJob;
import com.truthlens.ai.image_service.repository.DetectionJobRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ImageService {

    private final DetectionJobRepository repository;

    public UploadResponse processImage(MultipartFile file) {
        String jobId = UUID.randomUUID().toString();
        DetectionJob job = DetectionJob.builder()
                .jobId(jobId)
                .fileName(file.getOriginalFilename())
                .status("PROCESSING")
                .createdAt(LocalDateTime.now())
                .build();
        repository.save(job);
        return new UploadResponse(jobId, "Image uploaded successfully");
    }

}