package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue
    private long portId;

    @ManyToOne
    @JoinColumn(name="clientId")
    private Client client;

    @Column(nullable=false)
    private String firstName;

    @Column(nullable=false)
    private String lastName;

    @Column(nullable=false)
    private String riskFactor;

    @Column(nullable=false)
    private String total;

    protected Portfolio {

    }

    public Portfolio(String firstName, String lastName, String riskFactor, String total) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.riskFactor = riskFactor;
        this.total = total;
    }

    public Client getPortId() {
        return portId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRiskFactor() {
        return riskFactor;
    }

    public void setRiskFactor(String riskFactor) {
        this.riskFactor = riskFactor;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}