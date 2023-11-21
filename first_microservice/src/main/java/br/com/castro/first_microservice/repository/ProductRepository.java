package br.com.castro.first_microservice.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import br.com.castro.first_microservice.model.Product;
import br.com.castro.first_microservice.model.exception.ResourceNotFoundException;

@Repository
public class ProductRepository{

    private ArrayList<Product> products = new ArrayList<>();

    private Integer lastID = 0;

    public List<Product> getAll() {
        return products;
    }

    public Optional<Product> getById(Integer id) {
        return products.stream().filter(product -> product.getId() == id).findFirst();
    }

    public Product addProduct(Product product) {
        lastID++;
        product.setId(lastID);
        products.add(product);

        return product;
    }

    public void deleteProduct(Integer id) {
        products.removeIf(product -> product.getId() == id);
    }

    public Product updateProduct(Product product) {

        Optional<Product> productFound = getById(product.getId());

        if (productFound.isEmpty()) {
            throw new ResourceNotFoundException("Produto não encontrado");
        } else {
            deleteProduct(product.getId());
            products.add(product);
        }
        return product;
    }
}
