package com.platzi.platzi_market.persistence;

import com.platzi.platzi_market.persistence.crud.ProductoCrudRepository;
import com.platzi.platzi_market.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll() {
        // Obtener todos los productos - toda la lista de productos
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
