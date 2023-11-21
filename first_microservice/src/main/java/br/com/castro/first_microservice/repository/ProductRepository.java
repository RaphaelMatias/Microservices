package br.com.castro.first_microservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.castro.first_microservice.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    
}
