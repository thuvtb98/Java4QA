package Lession23;

import java.io.*;
import java.util.List;

public class DataFactory {

    //use OutputStreamWrite
    public static boolean WriteCustomerList1(List<Customer> customerList, String path){
        //write data of customer to a file use outputStreamWriter
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");
//            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

            for(Customer customer : customerList){
                String customerData = customer.getId() + ";" + customer.getName() + "\n";
                outputStreamWriter.write(customerData);
//                bufferedWriter.write("aaa");
            }
//            bufferedWriter.close();
            outputStreamWriter.close();
            fileOutputStream.close();

            return true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }

    //use DataOutputStream
    public static boolean writeCustomerList2(List<Customer> customerList, String path){

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);

            for(Customer customer : customerList){
                String customerData = customer.getId() + ";" + customer.getName() + "\n";
                dataOutputStream.writeBytes(customerData);
            }

            dataOutputStream.close();
            fileOutputStream.close();

            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    //use FileWriter
    public static boolean writeCustomerList3(List<Customer> customerList, String path){

        try {
            FileWriter fileWriter = new FileWriter(path);

            for(Customer customer : customerList){
                String customerData = customer.getId() + ";" + customer.getName() + "\n";
                fileWriter.write(customerData);
            }

            fileWriter.close();

            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    //read use FileReader
    public static boolean readCustomerList1(List<Customer> customerList, String path){
        try{
            FileReader fileReader = new FileReader(path);
            fileReader.read();
            System.out.println(fileReader);
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }




}
