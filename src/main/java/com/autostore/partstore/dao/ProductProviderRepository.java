package com.autostore.partstore.dao;

import com.autostore.partstore.entity.ProductProvider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "productProvider", path = "product-provider")
public interface ProductProviderRepository extends JpaRepository<ProductProvider, Long> {


}
