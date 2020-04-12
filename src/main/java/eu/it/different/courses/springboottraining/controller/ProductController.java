package eu.it.different.courses.springboottraining.controller;

import eu.it.different.courses.springboottraining.service.ProductService;
import eu.it.different.courses.springboottraining.service.dto.ProductDTO;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/v1/product")
@RestController
class ProductController {

    private final ProductService productService;

    ProductController(
        ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    public List<ProductDTO> products(){
        return productService.products();
    }
}
