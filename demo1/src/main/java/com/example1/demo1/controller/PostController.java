package com.example1.demo1.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.example1.demo1.model.Post;
import com.example1.demo1.service.impl.PostServiceImpl;
import com.example1.demo1.service.impl.UserServiceImpl;
import com.fasterxml.jackson.databind.util.JSONPObject;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/post")

public class PostController {
    
    @Autowired
    private PostServiceImpl postService;  
    
    @PostMapping("/publicar")
    private Post publicar(@RequestBody String post) throws JSONException, ParseException{
        
        JSONObject postJSON=new JSONObject(post);

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataFormateada = formato.parse(postJSON.getString("fecha")); 
        System.out.println(dataFormateada.toString());
        Post poster=new Post();
        poster.setAutor(postJSON.getString("autor"));
        poster.setDescripcion(postJSON.getString("descripcion"));
        poster.setPrecio(postJSON.getFloat("precio"));
        poster.setPostDate(dataFormateada);

        return postService.save(poster);
    }

    @GetMapping("/ObtenerObras")
    private List<Post> ObtenerObras(){
        return postService.BuscarTodos();
    }  
}
