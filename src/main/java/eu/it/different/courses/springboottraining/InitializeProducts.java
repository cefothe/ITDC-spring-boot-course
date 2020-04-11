package eu.it.different.courses.springboottraining;

import eu.it.different.courses.springboottraining.persistence.entity.product.GoldProduct;
import eu.it.different.courses.springboottraining.persistence.entity.product.PlatinumProduct;
import eu.it.different.courses.springboottraining.persistence.entity.product.SilverProduct;
import eu.it.different.courses.springboottraining.persistence.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class InitializeProducts implements ApplicationListener<ContextRefreshedEvent> {

    private static final Logger LOG = LoggerFactory.getLogger(SpringBootTrainingApplication.class);

    private final ProductRepository productRepository;

    public InitializeProducts(
        ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        if(productRepository.findAll().isEmpty()) {
            LOG.info("First start of the application populate database");
            productRepository.save(SilverProduct.create());
            productRepository.save(GoldProduct.create());
            productRepository.save(PlatinumProduct.create());
            LOG.info("Database is already populated with products");
        }else {
            LOG.info("Skip population");
        }
    }
}
