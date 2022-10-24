package com.nestdigital.TwitterClone.Dao;

import com.nestdigital.TwitterClone.Model.TwitterModel;
import org.springframework.data.repository.CrudRepository;

public interface TwitterDao extends CrudRepository<TwitterModel,Integer> {
}
