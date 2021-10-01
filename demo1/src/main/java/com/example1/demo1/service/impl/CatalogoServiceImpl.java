package com.example1.demo1.service.impl;

import com.example1.demo1.dao.CatalogoDao;
import com.example1.demo1.service.CatalogoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "catalogoService")
public class CatalogoServiceImpl implements CatalogoService{
    @Autowired
    private CatalogoDao catalogoDao;
}
