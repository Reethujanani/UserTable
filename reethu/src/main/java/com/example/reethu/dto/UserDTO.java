package com.example.reethu.dto;

import lombok.Data;

@Data

public class UserDTO {

    private int id;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private int mobileNo;
    private int isActive;
    private int isDeleted;

}
