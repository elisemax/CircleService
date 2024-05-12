package com.example.CircleService;

import com.example.CircleService.model.Circle;
import com.example.CircleService.model.Point;
import com.example.CircleService.service.CircleValidationService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class CircleValidationServicesTest {
    private static CircleValidationService circleValidationService;
    private static Circle circle;

    @BeforeAll
    public static void setUp() {
        circleValidationService = new CircleValidationService();
        circle = new Circle(new Point(0, 0), 5);
    }

    @Test
    public void shouldPointInsideCircle() {
        Point p = new Point(3, 4);
        assertTrue(circleValidationService.isPointInsideCircle(p, circle));
    }

    @Test
    public void shouldPointOutsideCircle() {
        Point p = new Point(6, 8);
        assertFalse(circleValidationService.isPointInsideCircle(p, circle));
    }
}
