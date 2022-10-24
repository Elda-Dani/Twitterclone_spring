package com.nestdigital.TwitterClone.Dao;

import com.nestdigital.TwitterClone.Model.TwitterModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TwitterDao extends CrudRepository<TwitterModel,Integer> {

    @Query(value = "SELECT `id`, `dob`, `email`, `name`, `password`, `phone_no`, `place` FROM `users` WHERE `email`=:email AND `password`=:password",nativeQuery = true)
    List<TwitterModel> twit(String email,String password);
}
