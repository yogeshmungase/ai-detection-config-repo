package com.truthlens.ai.image_service.repository;

import com.truthlens.ai.image_service.entity.DetectionJob;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetectionJobRepository
        extends MongoRepository<DetectionJob, String> {
}