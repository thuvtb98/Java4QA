package Lession24;

import Lession23.Customer;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.List;

public class DataFactory1 {
  public static boolean readCustomerList(List<Customer> customerList, String path){
    try{
      FileInputStream fileInputStream = new FileInputStream(path);
      InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
      BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

      String DataLine = bufferedReader.readLine();
      while(DataLine != null){
        String []cusData = DataLine.split(";");
        int id = Integer.parseInt(cusData[0]); //Integer.parseInt -> use for convert String to Integer
        String name = cusData[1];
        customerList.add(new Customer(id, name));
        DataLine = bufferedReader.readLine();
      }

      bufferedReader.close();
      inputStreamReader.close();
      fileInputStream.close();

      return true;
    }catch (Exception e){
      e.printStackTrace();
    }
    return false;
  }
}
