/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.norstc.ambleinfo.service;

import com.norstc.ambleinfo.entity.Customer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;

import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author zhangjh
 */
@Named(value = "customerBean")
@SessionScoped
public class CustomerBean implements Serializable{

    private List<Customer> customers;
 
    public List<Customer> getCustomers() {
        return customers;
    }
    /**
     * Creates a new instance of CustomerBean
     */
    public CustomerBean() {
    }
    @PostConstruct
    public void setup()  {
        customers = new ArrayList<Customer>();
 
        Customer customer1 = new Customer();
        customer1.setFirstName("John");
        customer1.setLastName("Doe");
        customer1.setCustomerId(123456);
 
        customers.add(customer1);
 
        Customer customer2 = new Customer();
        customer2.setFirstName("Adam");
        customer2.setLastName("Scott");
        customer2.setCustomerId(98765);
 
        customers.add(customer2);
 
        Customer customer3 = new Customer();
        customer3.setFirstName("Jane");
        customer3.setLastName("Doe");
        customer3.setCustomerId(65432);
 
        customers.add(customer3);
        this.customers = customers;
    }
}
