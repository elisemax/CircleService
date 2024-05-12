package com.example.CircleService.utils;

import com.example.CircleService.model.Circle;
import com.example.CircleService.model.Point;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CircleRequest {
    private Circle circle;
    private Point point;
}
