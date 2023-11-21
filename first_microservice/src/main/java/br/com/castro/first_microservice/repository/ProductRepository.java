package br.com.castro.first_microservice.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.castro.first_microservice.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {
    
}
