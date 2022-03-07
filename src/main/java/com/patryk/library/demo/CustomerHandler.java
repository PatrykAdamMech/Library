package com.patryk.library.demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class CustomerHandler {
    public Customer createNewCustomer(String firstName, String lastName, String personalId) {
        Customer customer = new Customer(firstName,lastName,personalId);
        //saveCustomerToFile(customer);
        return customer;
    }
    public int saveCustomerToFile(Customer c) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("users/"+c.getFirstName() + "_" + c.getLastName() + "_" + c.getPersonalNumber());
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(c);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (Exception e) {
            System.out.println("File not found!");
            return 0;
        }
        return 1;
    }
}
