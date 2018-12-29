package com.tanaponjit.cloud.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Promotion
 */
@Entity
public class Promotion {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String code;
    private Double discount;

    public Promotion(){

    }

    public Promotion(String code, Double discount){
        this.code = code;
        this.discount = discount;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the discount
     */
    public Double getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(Double discount) {
        this.discount = discount;
    }
    
}