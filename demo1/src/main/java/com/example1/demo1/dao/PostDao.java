package com.example1.demo1.dao;

import com.example1.demo1.model.Post;

import org.springframework.data.repository.CrudRepository;

public interface PostDao extends CrudRepository<Post,Long>{
    
}
