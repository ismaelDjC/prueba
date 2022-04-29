package com.apecs.factura.apecs.repository;

import com.apecs.factura.apecs.models.Proveedor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Proveedor_Repository extends JpaRepository<Proveedor,Integer> {
    
}
