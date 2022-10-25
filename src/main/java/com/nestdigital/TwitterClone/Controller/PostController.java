package com.nestdigital.TwitterClone.Controller;

import com.nestdigital.TwitterClone.Dao.PostDao;
import com.nestdigital.TwitterClone.Model.PostModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

@RestController
public class PostController {


    @Autowired
    private PostDao dao;


    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addpost",consumes = "application/json",produces = "application/json")
    public String addpost(@RequestBody PostModel post){
        DateTimeFormatter dt=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now=LocalDateTime.now();
        String currentdate=String.valueOf(dt.format(now));
        post.setPostdate(currentdate);
        System.out.println(post.toString());
        dao.save(post);
        return "{status:'success'}";
    }

    @CrossOrigin(origins = "*")
    @GetMapping(path = "/viewpost")
    public List<Map<String,String>> viewpost(){
        return (List<Map<String,String>>) dao.Post();
    }


    @CrossOrigin(origins = "*")
    @PostMapping(path = "/single", consumes = "application/json", produces = "application/json")
    List<Map<String,String>> viewsingle(@RequestBody PostModel post){
        return (List<Map<String,String>>) dao.View(post.getUserid());
    }
}
