package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String myText = "This is a simple text";

        String text1 = "My name is ";
          String text2 =  "John Doe";

          String finalText = text1 + text2;
          System.out.println(finalText);

          String text3 = "This is ";
          String text4 = "a test";

          String finalText2 = text3.concat(text4);
          System.out.println(finalText2);

          String text5 = "Text to compare";
          String text6 = "Text to compare";

        System.out.println(text5.equals(text6));
        System.out.println(text5.equalsIgnoreCase(text6));

        System.out.println(text5.length());
        System.out.println(text6.toUpperCase());
        System.out.println(text5.toLowerCase());

        System.out.println(finalText2.indexOf( "is"));

        System.out.println(text5.replaceAll("e", "i" ));
//standart output/input
        System.out.println("Test1 " );// bez  ln aiz print - tajā pašā rindā rakstīsies teksts
        System.out.println("Test2");

        System.out.printf("100.0 / 3.0 = %5.2f", 100.0 / 3.0);// printf
//converting string to  primitive
        String intStrValue = "1";
        String floatStrValue = "2.0";
        String doubleStrValue = "2.3434343434";
        String booleanStrValue = "true";
        String longStrValue = "100000000000000";

        int intValue = Integer.parseInt(intStrValue);
        double doubleValue = Double.parseDouble(doubleStrValue);
        float floatValue = Float.parseFloat(floatStrValue);
        boolean booleanValue = Boolean.parseBoolean(booleanStrValue);
        long longValue = Long.parseLong(longStrValue);

        System.out.println(intValue);
        System.out.println(floatValue);
        System.out.println(floatValue);
        System.out.println(booleanValue);
        System.out.println(longValue);

        //Homework
        //Find out if the string starts wit the specific characters
        String myStr = "This is String";
        System.out.println(myStr.startsWith ("This is")); //true
        System.out.println(myStr.startsWith ("  is"));//false
        System.out.println(myStr.startsWith ("String"));//false

        //Compare two strings
        String myStr1 = "My name is the best name";
        String myStr2 = "My name is the best name";
        System.out.println(myStr1.compareTo(myStr2));//0 - strings are equal

        //Remove whitespace from both sides of a string:
        String myStr3 = "       Black board and white letters      ";
        System.out.println(myStr3);
        System.out.println(myStr3.trim());
    }
}
