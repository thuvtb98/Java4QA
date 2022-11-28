package Lession9;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListLearning {
    public static void main(String[] args) {
        //1. Declare an ArrayList normal way and using asList to convert and create
        ArrayList<Integer> myNumList = new ArrayList<Integer>();
        ArrayList<String> myStringList = new ArrayList<String>();

        Float [] floatNumArray = {1.2f, 1.3f, 1.4f};
        List<Float> myFloatList = Arrays.asList(floatNumArray);

        //2. Add insert Edit Delete element in ArrayList
        //add random integer in the last position of list
        SecureRandom secureRandom = new SecureRandom();
        for(int i = 0; i <= 10; i++){
            myNumList.add(secureRandom.nextInt());
        }

        //add random integer in somewhere of List
        myNumList.add(2, 1000);

        //delete value
        myNumList.remove(0);

        //edit value
        myNumList.remove(0);
        myNumList.add(0, 100);

        //3. Interating ArrayList, normal for and for-each loop
        for(int i = 0; i< myNumList.size(); i++){
            System.out.println(myNumList.get(i));
        }
        System.out.println("============");

        for(int i : myNumList)
        {
            System.out.println(i);
        }
        System.out.println("============");

        //4. Check size, isEmpty
        System.out.println("Is myNumList empty: " + myNumList.isEmpty());
        System.out.println("Is myStringList empty: " + myStringList.isEmpty());

    }
}
