package Lession23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSort {
    public static void main(String[] args) {
        Customer customer1 = new Customer(001, "ZZZ");
        Customer customer2 = new Customer(002, "aaa");
        Customer customer3 = new Customer(003, "BB");

        List<Customer> customerList = new ArrayList<>();
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);

        System.out.println("List before sorting");
        for(Customer customer : customerList){
            System.out.println(customer);
        }

        System.out.println("List after sorting");
        Collections.sort(customerList); //have to use comparable interface for customer class to sort customer list
        for(Customer customer : customerList){
            System.out.println(customer);
        }
    }


}
