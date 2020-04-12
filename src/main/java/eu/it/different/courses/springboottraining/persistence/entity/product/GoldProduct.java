package eu.it.different.courses.springboottraining.persistence.entity.product;


import static eu.it.different.courses.springboottraining.persistence.entity.product.GoldProduct.*;

import java.math.BigDecimal;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = GOLD_TYPE)
public final class GoldProduct extends Product {

    public static final String GOLD_TYPE = "GOLD";
    private static final Double BAND_WIDTH = 60d;
    private static final BigDecimal FEE = BigDecimal.valueOf(20);

    private GoldProduct(Double bandwidth, BigDecimal fee) {
        super(bandwidth, fee);
    }

    protected GoldProduct() {
    }

    @Override
    public String getProductType() {
        return GOLD_TYPE;
    }

    public static final Product create(){
        return new GoldProduct(BAND_WIDTH, FEE);
    }

}
