package com.exampleProject.demo.Entity;

import javax.persistence.*;

@Entity
@Table(name = "product_entity")
public class ProductEntity {
    @Id
    @Column(name = "id")
    private long id;
    @Column
    private String productName;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private Byte[] productImage;






}
