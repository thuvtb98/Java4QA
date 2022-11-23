package Lession8;

public class StringLearning {

    public static void main(String[] args) {
        //declare string
        String myURL = "https://fss.com.vn";

        //String length
        System.out.printf("String length is: %d%n", myURL.length());

        //check for existing of char or substring
        int indexOfVn = myURL.indexOf(".vn");
        int indexOfSth = myURL.indexOf("abc");
        System.out.println("Index of .vn is: " + indexOfVn);
        System.out.println("Index of abc is: " +indexOfSth);

        //get a substring from string https://fss.com.vn
        String myDomain = myURL.substring(8, myURL.length());
        String myCompanyName = myURL.substring(8,11);
        System.out.printf("My domain is: %s%n",myDomain);
        System.out.printf("My company name is: %s%n", myCompanyName);

        //Trim(cắt khoảng trắng) a string
        String stringWithSomeSpaces = "   Thu    ";
        int lengthOfStringBeforeTrim = stringWithSomeSpaces.length();
        System.out.printf("Length of string before trim: %d%n", lengthOfStringBeforeTrim);
        int lengthOfStringAfterTrim = stringWithSomeSpaces.trim().length();
        System.out.printf("Length of string after trim: %d%n", lengthOfStringAfterTrim);

        //replace, replace all
        String stringAfterReplace = stringWithSomeSpaces.replace("u", "a Thu");
        System.out.printf("String after replace and trim: %s%n",stringAfterReplace.trim());

        //uppercase, lowercase
        System.out.println(myURL.toUpperCase());
        System.out.println(myURL.toLowerCase());

        //combine 2 string with + operator and concatenating
        String one = "Thu";
        String two = " de";
        String three = " thuong";

        String combine1 = one + two + three;
        String combine2 = one.concat(two).concat(three);

        System.out.println(combine1);
        System.out.println(combine2);

        //compare 2 string literal and compare 2 string after combine
        String name1 = "Thu de thuong";
        String name2 = "Thu de thuong";
        boolean isTheSame1 = name1 == name2;
        boolean isTheSame2 = name1 == combine2;

        System.out.println("Compare 2 string " + isTheSame1);
        System.out.println(isTheSame2);
    }
}
