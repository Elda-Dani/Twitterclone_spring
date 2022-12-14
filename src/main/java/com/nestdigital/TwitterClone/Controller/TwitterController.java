package com.nestdigital.TwitterClone.Controller;

import com.nestdigital.TwitterClone.Dao.TwitterDao;
import com.nestdigital.TwitterClone.Model.TwitterModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TwitterController {

   @Autowired
   private TwitterDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/adduser",consumes = "application/json",produces = "application/json")
    public String adduser(@RequestBody TwitterModel twit){
        System.out.println(twit.toString());
        dao.save(twit);
        return "{status:'success'}";
    }

}
