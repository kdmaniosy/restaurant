package com.clasearrays.arrays.restaurantapp;

import people.Customer;
import values.CustomerRole;

public class RestaurantApp {

    public static void main(String[] args) {
        Customer student = new Customer(CustomerRole.STUDENT, "asd", "Fulanito de Tal");
        student.sellFood();
        
        Customer administrative = new Customer(CustomerRole.ADMINISTRATIVE, "asa", "Sutanito de Tal");
        administrative.sellFood();
    }
}
