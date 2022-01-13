package com.example.reethu.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name ="user_table")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "username")
    private String userName;

    @Column(name = " password")
    private String password;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "mobile_no")
    private int mobileNo;

    @Column(name = "city")
    private String city;

    @Column(name = "is_active")
    private int isActive;

    @Column(name = "is_deleted")
    private int isDeleted;


}
