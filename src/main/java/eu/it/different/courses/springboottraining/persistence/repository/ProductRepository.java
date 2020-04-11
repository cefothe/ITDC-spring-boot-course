package eu.it.different.courses.springboottraining.persistence.repository;

import eu.it.different.courses.springboottraining.persistence.entity.product.Product;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT p FROM Product p WHERE product_type = :value ")
    Optional<Product> findByProductType(@Param("value") String value);
}
