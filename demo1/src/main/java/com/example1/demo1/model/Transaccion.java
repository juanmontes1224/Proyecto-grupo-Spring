package com.example1.demo1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transaccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; //la base de datos\

    //Comprador
    //Vendedor
    //Producto
    //Impuesto
    //Fecha
}
