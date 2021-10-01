package com.example1.demo1.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Catalogo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; //la base de datos\

    //Post
    @OneToMany
    private List<Post> posters=new ArrayList<>();

    //Compañia
    @Column
    private String compañia;
    public List<Post> getPosters() {
        return posters;
    }
    public void setPosters(List<Post> posters) {
        this.posters = posters;
    }
    public String getCompañia() {
        return compañia;
    }
    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }
    public String getEspecialidadCompañia() {
        return EspecialidadCompañia;
    }
    public void setEspecialidadCompañia(String especialidadCompañia) {
        EspecialidadCompañia = especialidadCompañia;
    }
    //Especialidad de la compañia
    @Column
    private String EspecialidadCompañia;
    //Transaccion 

}
