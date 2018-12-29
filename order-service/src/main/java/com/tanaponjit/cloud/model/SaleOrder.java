package com.tanaponjit.cloud.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class SaleOrder {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private Date date;
    private String status;
    private String promotion;
    private Double subnet;
    private Double discount;
    private Double net;

    @OneToMany(mappedBy="saleOrder", cascade=CascadeType.ALL)
    private Set<Item> items;

    public SaleOrder() {

    }

    public SaleOrder(Date date, String status, String promotion, Double subnet, Double discount, Double net, Set<Item> items) {
        this.date = date;
        this.status = status;
        this.promotion = promotion;
        this.subnet = subnet;
        this.discount = discount;
        this.net = net;
        this.items = items;
    }
}