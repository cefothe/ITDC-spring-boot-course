package eu.it.different.courses.springboottraining.service;

import eu.it.different.courses.springboottraining.persistence.entity.product.Product;
import eu.it.different.courses.springboottraining.persistence.repository.ProductRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(
        ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> products(){
        return productRepository.findAll();
    }
}
