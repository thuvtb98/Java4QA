package Lession24;

import Lession23.Customer;
import java.util.ArrayList;
import java.util.List;

public class TestReadData {

  public static void main(String[] args) {
    String path = "C:\\Users\\Admin\\IdeaProjects\\Java4QA\\Customer_Data.txt";
    List<Customer> customerList = new ArrayList<>();

    boolean isReadDataSuccess = DataFactory1.readCustomerList(customerList, path);
    System.out.println(isReadDataSuccess);
    for(Customer customer: customerList){
      System.out.println(customer);
    }

  }

}
