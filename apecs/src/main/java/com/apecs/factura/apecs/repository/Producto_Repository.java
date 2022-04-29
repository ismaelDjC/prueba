package com.apecs.factura.apecs.repository;

import com.apecs.factura.apecs.models.Producto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Producto_Repository extends JpaRepository<Producto, Integer>{
    
}
