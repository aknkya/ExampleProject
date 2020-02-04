package com.exampleProject.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class OrdersEntity {
    @Id
    private long id;
    @ManyToOne
    private UserEntity userEntity;
    @ManyToOne
    private ProductEntity productEntity;

}
