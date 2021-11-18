package com.example.demo.domain.ingredientDomain;

import java.math.BigDecimal;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;



@Table("Ingredient")
public  class Ingredient {
    @Id
    @Column("id")
    public UUID id;

    @Column("name")
    public String name;

    @Column("prize")
    public BigDecimal prize;

    

}
