package eu.it.different.courses.springboottraining.persistence.repository;

import static org.junit.jupiter.api.Assertions.*;

import eu.it.different.courses.springboottraining.persistence.entity.product.PlatinumProduct;
import eu.it.different.courses.springboottraining.persistence.entity.product.SilverProduct;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureDataJpa;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
@DataJpaTest
class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;

    @Test
    void findByProductType() {
        //given
        productRepository.save(SilverProduct.create());
        productRepository.save(PlatinumProduct.create());
        //when
        var result = productRepository.findByProductType("SILVER");
        //then
        assertTrue(result.isPresent(),"Product type didn't exists");
    }
}