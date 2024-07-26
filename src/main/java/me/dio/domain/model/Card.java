package me.dio.domain.model;

import java.math.BigDecimal;

public class Card {

    private long id;
    private String number;
    private BigDecimal Limit;

    public long getId() {
        return id;
    }
    public void setId(long id) { this.id = id; }

    public String getNumber() { return number; }

    public void setNumber(String number) { this.number = number; }

    public BigDecimal getLimit() { return Limit; }

    public void setLimit(BigDecimal limit) { Limit = limit; }
}
