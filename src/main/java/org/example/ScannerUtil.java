package org.example;

import java.util.Scanner;

public class ScannerUtil {

    private static final Scanner scanner = new Scanner(System.in);

    //Use this method to get a String
    public static String getString() {
        return scanner.nextLine().trim();
    }
    //Copied from Tuesday's lecture
    public static int getInteger(){
        boolean invalidInt = true;
        int number = 0;
        while(invalidInt){
            try{
                String numberAsString = getString().trim();
                number = Integer.valueOf(numberAsString);
                invalidInt = false;
            }catch (NumberFormatException ex){
                System.out.println(ex);
            }
        }
        return number;
    }
    //Use this method to get a double
    public static double getDouble() {
        boolean invalidDouble = true;
        double number = 0;
        while (invalidDouble) {
            try {
                number = Double.parseDouble(getString().replace(',', '.'));
                invalidDouble = false;
            } catch (NumberFormatException ex) {
                System.out.println("Not a valid number");
            }
        }
        return number;
    }
}
