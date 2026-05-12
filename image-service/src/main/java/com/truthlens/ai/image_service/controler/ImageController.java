package com.truthlens.ai.image_service.controler;

import com.truthlens.ai.image_service.service.ImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/images")
@RequiredArgsConstructor
public class ImageController {

    private final ImageService imageService;

    @PostMapping("/detect")
    public ResponseEntity<?> uploadImage(@RequestParam("file") MultipartFile file) {

        return ResponseEntity.ok(imageService.processImage(file)
        );
    }

}
