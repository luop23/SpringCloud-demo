package com.luop.dao;

import com.luop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserDao extends JpaRepository<User,Integer> {

    @Query("from User u where u.id = :id")
    User getUserById(@Param("id") int id);
//    User findUserById(int id);
}
