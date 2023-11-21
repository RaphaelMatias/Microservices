package br.com.castro.first_microservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.castro.first_microservice.model.Product;
import br.com.castro.first_microservice.repository.ProductRepository_old;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository_old productRepository;

    public List<Product> getAll() {
        return productRepository.getAll();
    }

    public Optional<Product> getById(Integer id) {
        return productRepository.getById(id);
    }

    public Product addProduct(Product product) {
        return productRepository.addProduct(product);
    }

    public void deleteProduct(Integer id) {
        productRepository.deleteProduct(id);
    }

    public Product updateProduct(Integer id, Product product) {
    
        product.setId(id);

        return productRepository.updateProduct(product);
    }
}
