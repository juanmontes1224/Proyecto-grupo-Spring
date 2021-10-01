package com.example1.demo1.dao;

import com.example1.demo1.model.Catalogo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CatalogoDao extends CrudRepository <Catalogo, Long> {
    //Post findByName(String name);
    
}