package eu.it.different.courses.springboottraining.persistence.entity.product;

import java.math.BigDecimal;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "PLATINUM")
public final class PlatinumProduct extends Product {

    private static final Double BAND_WIDTH = 80d;
    private static final BigDecimal FEE = BigDecimal.valueOf(26);

    private PlatinumProduct(Double bandwidth, BigDecimal fee) {
        super(bandwidth, fee);
    }

    protected PlatinumProduct() {
    }

    public static Product create(){
        return new PlatinumProduct(BAND_WIDTH, FEE);
    }
}
