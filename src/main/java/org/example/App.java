package org.example;

public class App {

    public static void main(String[] args) {
        boolean on = true;
        double num1 = 0, num2 = 0; //setting things up

        System.out.print("Basic Calculator by Patrik. \n");
        while(on)
        {
            System.out.print("\nPlease choose one of these operations (+,-,/,*), or type stop to end the program. \n");
            String choice = ScannerUtil.getString();
            if (choice.equals("stop")){
                on = false;
                System.out.print("Bye");
                break;
            }

            System.out.print("Enter the first number. \n");
            num1 = ScannerUtil.getDouble();
            System.out.print("Enter the second number. \n");
            num2 = ScannerUtil.getDouble();

            System.out.print( calculator(choice, num1, num2));
        }



        }
    public static double calculator(String choice, double num1, double num2){
        double answer = 0;
        switch (choice){
            case "+": // addition
                answer = num1 + num2;
                break;
            case "-": // subtraction
                answer = num1 - num2;
                break;
            case "*": // multiplication
                answer = num1 * num2;
                break;
            case "/": // division
                answer = num1 / num2;
                break;
        }return answer;
    }
}