package com.example.sem4flutterexam.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlaceEntity {
    private String destinationName;
    private String destinationThumbnail;
    private double destinationRating;
}
