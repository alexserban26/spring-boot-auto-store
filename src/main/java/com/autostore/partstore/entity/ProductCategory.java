package com.autostore.partstore.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "product_category")
@Getter
@Setter
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column(name = "category_name")
    private String categoryName;

    @Column(name = "category_description")
    private String categoryDescription;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    private Set<Product> products;
}
