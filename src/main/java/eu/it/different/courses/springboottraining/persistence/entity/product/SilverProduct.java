package eu.it.different.courses.springboottraining.persistence.entity.product;

import java.math.BigDecimal;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "SILVER")
public final class SilverProduct extends Product {

    private static String SILVER_TYPE = "SILVER";
    private static final Double BAND_WIDTH = 30d;
    private static final BigDecimal FEE = BigDecimal.valueOf(15);

    private SilverProduct(Double bandwidth, BigDecimal fee) {
        super(bandwidth, fee);
    }

    protected SilverProduct() {
    }

    @Override
    public String getProductType() {
        return SILVER_TYPE;
    }

    public static Product create(){
        return new SilverProduct(BAND_WIDTH, FEE);
    }
}
