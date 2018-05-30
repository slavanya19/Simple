package com.kg.sample;

import java.util.ArrayList;

public class CustomerTest {
    static ArrayList<Customer> customerList = new ArrayList<Customer>();
    static Customer c = new Customer(1, "guna", 96290163L, 500L, 20L);
    static Customer c1 = new Customer(2, "thanu", 96290163L, 500L, 20L);
    static Customer c2 = new Customer(3, "dhamomadharan", 95665103L, 1000L, 30L);

    public static void main(String[] args) {
        createCustomer();
        searchCustomer(1L);
        updateCustomer(1L, c2);
        removeCustomer();
        allCustomers();

    }

    public static void createCustomer() {

        customerList.add(c);
        customerList.add(c1);
    }

    public static void allCustomers() {
        System.out.println(customerList);
    }

    public static void removeCustomer() {
        customerList.remove(1);
    }

    public static void searchCustomer(long customerId) {
        for (Customer c : customerList) {
            if (c.getCustid() == customerId) {
                // System.out.println(c);
            }
        }
    }

    public static void updateCustomer(long customerId, Customer c2) {
        customerList.get(0).setName(c2.getName());
        for (Customer c : customerList) {
            if (c.getCustid() == customerId) {
                c.setName(c2.getName());
                c.setPhoneNumber(c2.getPhoneNumber());
                c.setPurchaseAmount(c2.getPurchaseAmount());
                c.setPointsEarned(c2.getPointsEarned());
            }
        }
    }

}