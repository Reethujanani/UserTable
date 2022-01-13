package com.example.reethu.service.serviceImpl;


import com.example.reethu.dto.UserDTO;
import com.example.reethu.entity.User;
import com.example.reethu.repository.UserRepository;
import com.example.reethu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class UserServiceImpl<user_table> implements UserService {

    @Autowired
    private UserRepository userRepository;

    private Object String_firstname;

    @Override
    public List<User> listAllDetails() {
        
        List<user_table> findByTitleContains(String Object firstname);
        return userRepository.findAll();

    }

    private void assertEquals(int i, int size) {
    }

    @Override
    public User addUser(UserDTO userDTO) {
        User user1 = new User();
        user1.setUserName(user1.getUserName());
        user1.setPassword(user1.getPassword());
        user1.setFirstName(user1.getFirstName());
        user1.setLastName(user1.getLastName());
        user1.setMobileNo(user1.getMobileNo());
        user1.setCity(user1.getCity());
        user1.setIsActive(user1.getIsActive());
        user1.setIsDeleted(user1.getIsDeleted());
        userRepository.save(user1);
        return null;
    }


    @Override
    public User getUserDetailsByID(int id) {
        Optional<User> user = userRepository.findById(id);
        return user.get();
    }

    @Override
    public User updateUserDetails(UserDTO userDTO) {
        User user = new User();
        user.setId(user.getId());
        user.setFirstName(user.getFirstName());
        user.setUserName(user.getUserName());
        user.setLastName(user.getLastName());
        user.setMobileNo(user.getMobileNo());
        user.setIsActive(user.getIsActive());
        user.setPassword(user.getPassword());
        user.setIsDeleted(user.getIsDeleted());
        userRepository.save(user);
        return null;
    }


    @Override
    public User deleteById(int id) {
        userRepository.deleteById(id);
        return null;



    }

}