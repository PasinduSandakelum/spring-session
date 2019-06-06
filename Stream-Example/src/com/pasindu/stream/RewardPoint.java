package com.pasindu.stream;


import java.math.BigDecimal;

public class RewardPoint {

    Integer id;

    BigDecimal amountLimit;

    Double point;

    public RewardPoint() {
    }

    public RewardPoint(Integer id, BigDecimal amountLimit, Double point) {
        this.id = id;
        this.amountLimit = amountLimit;
        this.point = point;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPoint() {
        return point;
    }

    public void setPoint(Double point) {
        this.point = point;
    }

    public BigDecimal getAmountLimit() {
        return amountLimit;
    }

    public void setAmountLimit(BigDecimal amountLimit) {
        this.amountLimit = amountLimit;
    }

    @Override
    public String toString() {
        return "RewardPoint{" +
                "id=" + id +
                ", amountLimit=" + amountLimit +
                ", point=" + point +
                '}';
    }
}
