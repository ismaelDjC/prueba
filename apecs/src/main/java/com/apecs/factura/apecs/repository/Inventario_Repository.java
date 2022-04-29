package com.apecs.factura.apecs.repository;

import com.apecs.factura.apecs.models.Inventario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Inventario_Repository extends JpaRepository<Inventario,Integer>{

}
