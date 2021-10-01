package com.example1.demo1.service.impl;

import java.util.List;

import com.example1.demo1.dao.PostDao;
import com.example1.demo1.model.Post;
import com.example1.demo1.service.PostService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "postService")
public class PostServiceImpl implements PostService{
    @Autowired
    private PostDao postDao;

    public Post save(Post poster){
        return postDao.save(poster);
    }  
    public List<Post> BuscarTodos(){
        return (List<Post>) postDao.findAll();
    }
}

