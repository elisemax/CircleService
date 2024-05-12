package com.example.CircleService.controller;

import com.example.CircleService.utils.CircleErrorResponse;
import com.example.CircleService.utils.CircleInvalidRequest;
import com.example.CircleService.utils.CircleRequest;
import com.example.CircleService.service.CircleValidationService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/circles")
@AllArgsConstructor
public class CircleController {
    @Autowired
    private final CircleValidationService circleValidationService;

    @PostMapping("/is_point_inside_circle")
    public boolean isPointInsideCircle(@RequestBody CircleRequest request) {
        return circleValidationService.isPointInsideCircle(request.getPoint(), request.getCircle());
    }

    @ExceptionHandler
    private ResponseEntity<CircleErrorResponse> handleException(Exception e) {
        return ResponseEntity.badRequest().body(new CircleErrorResponse("""
                Invalid request format provided: format must be {"circle": {"center": {"x": 0.0, "y": 0.0}, "radius": 1.0}, "point": {"x": 0.0, "y": 0.0}}"""));
    }
}
