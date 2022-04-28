package com.apecs.factura.apecs.repository;

import com.apecs.factura.apecs.models.Factura;

import org.springframework.data.jpa.repository.JpaRepository;

public  interface Factura_Repository extends JpaRepository<Factura, Integer> {
    
}
