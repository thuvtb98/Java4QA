package Lession23;

import java.util.ArrayList;
import java.util.List;

public class TestDataFactory {
    public static void main(String[] args) {
        String path1 = "C:\\Users\\Admin\\IdeaProjects\\Java4QA\\customer_data.txt";
        String path2 = "C:\\Users\\Admin\\IdeaProjects\\Java4QA\\customer_data2.txt";
        String path3 = "C:\\Users\\Admin\\IdeaProjects\\Java4QA\\customer_data3.txt";

        Customer customer1 = new Customer(001, "ZZZ");
        Customer customer2 = new Customer(002, "aaa");
        Customer customer3 = new Customer(003, "BB");

        List<Customer> customerList = new ArrayList<>();
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);

//        boolean isWriteDataSuccess1 = DataFactory.WriteCustomerList1(customerList, path1);
//        System.out.println(isWriteDataSuccess1);

//        boolean isWriteDataSuccess2 = DataFactory.writeCustomerList2(customerList, path2);
//        System.out.println(isWriteDataSuccess2);

        boolean isWriteDataSuccess3 = DataFactory.writeCustomerList3(customerList, path3);
        System.out.println(isWriteDataSuccess3);

        List<Customer> customerListRead = new ArrayList<>();
        boolean isReadDataSuccess1 = DataFactory.readCustomerList1(customerListRead, path3);
        System.out.println(isReadDataSuccess1);

    }
}
