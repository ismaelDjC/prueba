package com.apecs.factura.apecs.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id_cliente;

    private  String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }
    public Cliente(){}
    public Integer getId_cliente() {
        return Id_cliente;
    }
    public void setId_cliente(Integer id_cliente) {
        Id_cliente = id_cliente;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
