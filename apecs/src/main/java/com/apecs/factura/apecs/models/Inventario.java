package com.apecs.factura.apecs.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "inventario")
public class Inventario {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id_inventario;
	
	private String numero_stock;
	
	private Date fecha_inventario;

    //private Producto producto;

    //private Proveedor proveedor;
  

    public Inventario() {
    }

    public String getId_inventario() {
        return id_inventario;
    }

    public void setId_inventario(String id_inventario) {
        this.id_inventario = id_inventario;
    }

    public String getNumero_stock() {
        return numero_stock;
    }

    public void setNumero_stock(String numero_stock) {
        this.numero_stock = numero_stock;
    }

    public Date getFecha_inventario() {
        return fecha_inventario;
    }

    public void setFecha_inventario(Date fecha_inventario) {
        this.fecha_inventario = fecha_inventario;
    }

    /*public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }*/

    
    
}
