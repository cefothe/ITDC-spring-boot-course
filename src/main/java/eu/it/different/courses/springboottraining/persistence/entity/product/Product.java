package eu.it.different.courses.springboottraining.persistence.entity.product;

import eu.it.different.courses.springboottraining.persistence.entity.BaseEntity;
import java.math.BigDecimal;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Table(name = "product")
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "product_type", discriminatorType = DiscriminatorType.STRING)
public abstract class Product extends BaseEntity {
    private Double bandwidth;
    private BigDecimal fee;

    protected Product(Double bandwidth, BigDecimal fee) {
        this.bandwidth = bandwidth;
        this.fee = fee;
    }

    public Product() {
    }

    public Double getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Double bandwidth) {
        this.bandwidth = bandwidth;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

}
