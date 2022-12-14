package com.example.dao.impl;

import com.example.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User,Integer>, UserRepositoryCustom {
    User findByName(String alma);
    User findByNameAndSurname(String alma,String alma2);
    User findById(int id);
    @Query(value="select u from User u where u.email=:email")
    User findByEmail(@Param("email") String email);
}
