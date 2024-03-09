package com.chandooiitm.mongodbdemo.entity;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document(collection = "product")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Product {
    @Id
    private String  id;
    private String name;
    private String type;
    private String location;
    private String quantity;
    private String availability;
    private String requiredFrom;
    private String userId;

}
