package me.dio.domain.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_card")
public class Card {

    @Id
    @GeneratedValue(Strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;

    @Column(name = "avaliable_limit",scale = 2,precision = 13)
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
