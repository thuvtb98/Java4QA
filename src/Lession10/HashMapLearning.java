package Lession10;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapLearning {

    public static void main(String[] args) {
        //1. Declare Hashmap
        Map<Integer, String> myStudentList = new HashMap<>();
        Map<Integer, String> myTestList = new HashMap<>();

        //2. CRUD - Create, Read, Update, Delete (DB - like context)
        myStudentList.put(0001, "Nguyen Van A");
        myStudentList.put(0002, "Nguyen Van B");

        System.out.println("student name with id 0001 is: "+ myStudentList.get(0002));

        myStudentList.replace(0002, "Nguyen Van 2");
        System.out.println("student name with id 0001 is: "+ myStudentList.get(0002));

        System.out.println("Hashmap size before removing: "+ myStudentList.size());
        myStudentList.remove(0002);
        System.out.println("Hashmap size after removing: "+ myStudentList.size());

        System.out.println("Is 0002 key existing: "+ myStudentList.containsKey(0002));

        //3. When you put 2 value in the same key, it will replace the new value
        myTestList.put(01, "Thu");
        myTestList.put(02, "Vi");
        myTestList.put(02, "Bich");
        System.out.println("Text value with id 02 is: "+ myTestList.get(02));

        //4. Get all keys
        Set<Integer> allTestKeys = myTestList.keySet();
        for(int i : allTestKeys){
            System.out.println(i);
        }

        //5. Get all values
        Collection allTestValue = myTestList.values();
        for(Object v : allTestValue){
            System.out.println(v.toString());
        }


    }
}
