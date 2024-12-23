package com.platzi.platzi_market.persistence.mapper;

import com.platzi.platzi_market.persistence.entity.Categoria;
import com.platzi.platzi_market.domain.Category;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    @Mappings({
            @Mapping(source = "idCategoria", target = "categoryId"),
            @Mapping(source = "descripcion", target = "category"),
            @Mapping(source = "estado", target = "active"),

    })
    Category toCategory(Categoria categoria);

    @InheritInverseConfiguration
    @Mapping(target = "productos", ignore = true)
    Categoria toCategory(Category category);

}
