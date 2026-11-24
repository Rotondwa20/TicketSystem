package co.za.portfolio.domain;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String street;
    private String surburb;
    private String city;
    private String zipCode;
}
