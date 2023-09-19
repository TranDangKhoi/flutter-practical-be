package com.example.sem4flutterexam.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DestinationEntity {
    private String destinationName;
    private String destinationThumbnail;
    private double destinationRating;
}
