package eu.it.different.courses.springboottraining.service.mapper;

import eu.it.different.courses.springboottraining.persistence.entity.product.Product;
import eu.it.different.courses.springboottraining.service.dto.ProductDTO;
import eu.it.different.courses.springboottraining.service.dto.ProductType;
import java.util.function.Function;

public enum ProductEntityToDTOMapper implements Function<Product, ProductDTO> {
    INSTANCE;

    @Override
    public ProductDTO apply(Product product) {
        return new ProductDTO(ProductType.valueOf(product.getProductType()), product.getBandwidth(), product.getFee());
    }
}
