package com.revature.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString

public class BillingAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    public BillingAddress(int iD) {
        ID = iD;
    }

    private String street;
    private String city;
    private String state;
    private int zip;

    public BillingAddress(int iD, String street, String city, String state, int zip) {
        super();
        ID = iD;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

}
