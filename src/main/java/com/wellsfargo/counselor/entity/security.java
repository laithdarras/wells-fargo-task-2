package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Security {
    @Id
    @GeneratedValue
    private long securityId;

    @ManyToOne
    @JoinColumn(name="portId")
    private Portfolio portfolio; // object approach rather than long

    @Column(nullable=false)
    private String symbol;

    @Column(nullable=false)
    private String type;

    @Column(nullable=false)
    private String quantity;

    @Column(nullable=false)
    private String price;

    @Column(nullable=false)
    private String total;

    protected Client {

    }

    public Client(String symbol, String type, String quantity, String price, String total) {
        this.symbol = symbol;
        this.type = type;
        this.quantity = quantity;
        this.price = price;
        this.total = total;
    }

    public Portfolio getSecurityId() {
        return securityId;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTotal() {
        return email;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}