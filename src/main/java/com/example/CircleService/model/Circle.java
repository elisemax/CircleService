package com.example.CircleService.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


/**
* This class represents a circle with a center and a radius
 */
@Getter
@Setter
@AllArgsConstructor
public class Circle {
    private Point center;
    private double radius;
}
