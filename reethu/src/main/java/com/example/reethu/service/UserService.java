package com.example.reethu.service;


import com.example.reethu.dto.UserDTO;
import com.example.reethu.entity.User;


import java.util.List;

public interface UserService  {

    List<User> listAllDetails();

    User addUser(UserDTO userDTO);

    User getUserDetailsByID(int id);

    User updateUserDetails(UserDTO userDTO);

    User deleteById(int id);

    User listAll(Object user_name);
}


