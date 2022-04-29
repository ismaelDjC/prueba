package com.apecs.factura.apecs.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "detalle")
public class Detalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id_detalle;

    private Integer cantidad;

    public Detalle(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Detalle(){}

    public Integer getId_detalle() {
        return Id_detalle;
    }

    public void setId_detalle(Integer id_detalle) {
        Id_detalle = id_detalle;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    
    

    
}
