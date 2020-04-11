package eu.it.different.courses.springboottraining.persistence.entity.product;

import java.math.BigDecimal;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "GOLD")
public final class GoldProduct extends Product {

    private static final Double BAND_WIDTH = 60d;
    private static final BigDecimal FEE = BigDecimal.valueOf(20);

    private GoldProduct(Double bandwidth, BigDecimal fee) {
        super(bandwidth, fee);
    }

    protected GoldProduct() {
    }

    public static final Product create(){
        return new GoldProduct(BAND_WIDTH, FEE);
    }

}
