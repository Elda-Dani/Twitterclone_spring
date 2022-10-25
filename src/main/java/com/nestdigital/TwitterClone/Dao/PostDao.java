package com.nestdigital.TwitterClone.Dao;

import com.nestdigital.TwitterClone.Model.PostModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Map;

public interface PostDao extends CrudRepository<PostModel,Integer> {



    @Query(value = "SELECT p.id,p.userid, p.`post`, p.`postdate`, u.name FROM `post` p JOIN users u ON u.id=p.userid WHERE p.`userid`=:userid",nativeQuery = true)
    List<Map<String,String>> View(Integer userid);

    @Query(value = "SELECT p.id,p.userid, p.`post`, p.`postdate`, u.name FROM `post` p JOIN users u ON u.id=p.userid",nativeQuery = true)
    List<Map<String,String>> Post();
}
