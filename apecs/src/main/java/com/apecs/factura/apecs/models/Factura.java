package com.apecs.factura.apecs.models;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "factura")
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id_factura;

    private Date fecha;

    private boolean total;

    public Factura(Date fecha, boolean total) {
        this.fecha = fecha;
        this.total = total;
    }
    public Factura(){

    }
    public Integer getId_factura() {
        return Id_factura;
    }
    public void setId_factura(Integer id_factura) {
        Id_factura = id_factura;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public boolean isTotal() {
        return total;
    }
    public void setTotal(boolean total) {
        this.total = total;
    }
    
    

   
    
}
