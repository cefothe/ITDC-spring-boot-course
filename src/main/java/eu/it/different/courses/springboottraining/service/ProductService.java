package eu.it.different.courses.springboottraining.service;

import eu.it.different.courses.springboottraining.persistence.repository.ProductRepository;
import eu.it.different.courses.springboottraining.service.dto.ProductDTO;
import eu.it.different.courses.springboottraining.service.mapper.ProductEntityToDTOMapper;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(
        ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductDTO> products(){
        return productRepository.findAll()
            .stream()
            .map(ProductEntityToDTOMapper.INSTANCE::apply)
            .collect(Collectors.toList());
    }
}
