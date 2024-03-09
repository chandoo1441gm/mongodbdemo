package com.chandooiitm.mongodbdemo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ProductRequest {
    private String  id;
    private String name;
    private String type;
    private String location;
    private String quantity;
    private String availability;
    private String requiredFrom;
    private String userId;

}