package com.example.reethu.controller;


import com.example.reethu.dto.UserDTO;
import com.example.reethu.entity.User;
import com.example.reethu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/user")

public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/post")
    public User addUser(@RequestBody UserDTO userDTO) {
        return userService.addUser(userDTO);
    }

    @GetMapping("/get")
    public List<User> getAllDetails(){
        return userService.listAllDetails();
    }

    @GetMapping("/getById/{id}")
    public User getDetailsByID(@PathVariable int id){
        return userService.getUserDetailsByID(id);
    }


    @PutMapping("/update")
    public User updateUser(@RequestBody UserDTO userDTO) {
        return userService.updateUserDetails(userDTO);
    }

    @DeleteMapping("/deleteById")
    public User delete( int id){
        return null;

        @RequestMapping("/search/{user_name}")
        public List<User> searchUser(@PathVariable String Object user_name);
        {
            return userService.listAll(user_name);
        }
    }
}

















