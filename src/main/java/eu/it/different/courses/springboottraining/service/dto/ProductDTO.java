package eu.it.different.courses.springboottraining.service.dto;

import java.math.BigDecimal;

public class ProductDTO {
    private ProductType type;
    private Double bandwidth;
    private BigDecimal fee;

    public ProductDTO(ProductType type, Double bandwidth, BigDecimal fee) {
        this.type = type;
        this.bandwidth = bandwidth;
        this.fee = fee;
    }

    public ProductDTO() {
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
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
