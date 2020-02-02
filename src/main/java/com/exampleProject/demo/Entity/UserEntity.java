package com.exampleProject.demo.Entity;



import javax.persistence.*;
import javax.swing.*;
import javax.validation.constraints.NotNull;



@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String UserId;
    @NotNull
    private String pasword;
    @NotNull
    private String userFirstName;
    @NotNull
    private String userLastname;
    @NotNull
    private String userEmail;
    @OneToOne
    private UserRole userRole;


}
