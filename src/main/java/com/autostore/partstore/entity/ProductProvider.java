package com.autostore.partstore.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "product_provider")
@Getter
@Setter
public class ProductProvider {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "provider_name")
    private String providerName;

    @Column(name = "country")
    private String country;

    @Column(name = "city")
    private String city;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "provider")
    private Set<Product> products;

}
