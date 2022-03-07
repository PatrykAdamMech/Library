package com.patryk.library.demo;

public class Customer {
    private String firstName;
    private String lastName;
    private String personalNumber;
    private Rental[] rentals;

    Customer(String firstName, String lastName, String personalNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personalNumber = personalNumber;
        this.rentals = new Rental[3];
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

    public String getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
    }

    public Rental[] getRentals() {
        return rentals;
    }

    public void setRentals(Rental[] rentals) {
        this.rentals = rentals;
    }
}
