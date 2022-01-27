package com.webshop.sample.entity;

import lombok.Data;

import javax.persistence.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "PRODUCTS")
public class Product {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "NAME")
    @NotNull(message = "Name cannot be null")
    private String name;

    @Column(name = "CODE")
    @NotNull(message = "Code cannot be null")
    @Size(min = 10, max = 10, message = "Code must be exactly 10 characters")
    private String code;
    
    @PositiveOrZero
    @NotNull(message = "Code cannot be null")
    @Column(name="PRICEHRK")
    private Double priceHrk;
    
    @PositiveOrZero
    @Column(name="PRICEEUR")
    private Double priceEur;
    
    @Column(name="DESCRIPTION")
    private String description;

    @NotNull(message = "Code cannot be null")
    @Column(name="ISAVAILABLE")
    private Boolean isAvailable;
    
    public Product() {
    }


	public Product(long id, String name, String code, Double priceHrk, Double priceEur, String description,
			Boolean isAvailable) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.priceHrk = priceHrk;
		this.priceEur = priceEur;
		this.description = description;
		this.isAvailable = isAvailable;
	}
    
    public void setPriceEur(Double priceEur) {
    	this.priceEur=priceEur;
    }
    public Double getPriceEur() {
    	return priceEur;
    }
    public void setPriceHrk(Double priceHrk) {
    	this.priceHrk=priceHrk;
    }
    public Double getPriceHrk() {
    	return priceHrk;
    }
    

    
}
