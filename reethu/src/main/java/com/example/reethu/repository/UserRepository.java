package com.example.reethu.repository;


import com.example.reethu.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer>{
    @Query("SELECT r FROM Reethu r WHERE r.user_name LIKE %:user_name%")
    public List<User> getByUser(String user_name);
}
