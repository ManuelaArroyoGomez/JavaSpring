package com.platzi.platzi_market.persistence;

import com.platzi.platzi_market.persistence.crud.ProductoCrudRepository;
import com.platzi.platzi_market.persistence.entity.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll() {
        // Obtener todos los productos - toda la lista de productos
        return (List<Producto>) productoCrudRepository.findAll();
    }

    public List<Producto> getByCategoria(int idCategoria){
        return  productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }

    public Optional<List<Producto>> getEscasos(int cantidad){
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad, true);
    }

    // Obtener un producto con el id
    public Optional<Producto> getProducto(int idProducto){
        return productoCrudRepository.findById(idProducto);
    }

    // Guardar y eliminar
    public Producto save(Producto producto){
        return productoCrudRepository.save(producto);
    }
    public void delete(int idProducto){
        productoCrudRepository.deleteById(idProducto);
    }
}
