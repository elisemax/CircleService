package com.example.CircleService.service;

import com.example.CircleService.model.Circle;
import com.example.CircleService.model.Point;
import org.springframework.stereotype.Service;

@Service
public class CircleValidationService {

    /**
     * This method checks if a point is inside the circle
     * @param p the point to check
     * @return true if the point is inside the circle, false otherwise
     */
    public boolean isPointInsideCircle(Point p, Circle circle) {
        double distance = Math.sqrt(Math.pow(p.getX() - circle.getCenter().getX(), 2) + Math.pow(p.getY() - circle.getCenter().getY(), 2));
        return distance <= circle.getRadius();
    }
}
