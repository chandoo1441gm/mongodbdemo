package com.chandooiitm.mongodbdemo.mapper;

import com.chandooiitm.mongodbdemo.dto.ProductRequest;
import com.chandooiitm.mongodbdemo.dto.ProductResponse;
import com.chandooiitm.mongodbdemo.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    public Product toEntity(ProductRequest productRequest);

    public ProductResponse toDto(Product product);

    @Mapping(target = "id", ignore = true)
    public Product updateProductFormDto(ProductRequest productRequest,
                                        @MappingTarget Product product);

}


