package com.exampleProject.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class UserRole {

    @Id
    private int userRoleId;
    @NotNull
    private String userRole;


}
