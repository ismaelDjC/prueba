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
    private Integer Id_secretaria;

    private Date fecha;

    private boolean total;

    public Factura(Date fecha, boolean total) {
        this.fecha = fecha;
        this.total = total;
    }
    public Factura(){}
    public Integer getId_secretaria() {
        return Id_secretaria;
    }
    public void setId_secretaria(Integer id_secretaria) {
        Id_secretaria = id_secretaria;
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
