package org.example;

public class App {

    public static void main(String[] args) {
        boolean on = true;
        System.out.print("Basic Calculator by Patrik. \n");
        while(on)
        {
            System.out.print("\nPlease choose one of these operations (+,-,/,*), or type stop to end the program. \n");
            String operation = ScannerUtil.getString();
            if("+".equals(operation))
            {
                System.out.print("Type in the first number. \n");
                double add1 = ScannerUtil.getDouble();
                System.out.print("Type the second number. \n");
                double add2 = ScannerUtil.getDouble();
                double add3 = add1 + add2;
                System.out.print(add1 + "+" + add2 + "=" + add3 + "\n");
            }
            if("-".equals(operation))
            {
                System.out.print("Type in the first number. \n");
                double sub1 = ScannerUtil.getDouble();
                System.out.print("Type the second number. \n");
                double sub2 = ScannerUtil.getDouble();
                double sub3 = sub1 - sub2;
                System.out.print(sub1 + "-" + sub2 + "=" + sub3 + "\n");
            }
            if("/".equals(operation))
            {
                System.out.print("Type in the first number. \n");
                double div1 = ScannerUtil.getDouble();
                System.out.print("Type the second number. \n");
                double div2 = ScannerUtil.getDouble();
                double div3 = div1 / div2;
                System.out.print(div1 + "/" + div2 + "=" + div3 + "\n");
            }
            if("*".equals(operation))
            {
                System.out.print("Type in the first number. \n");
                double mul1 = ScannerUtil.getDouble();
                System.out.print("Type the second number. \n");
                double mul2 = ScannerUtil.getDouble();
                double mul3 = mul1 * mul2;
                System.out.print(mul1 + "*" + mul2 + "=" + mul3 + "\n");
            }
            if("stop".equals(operation))
            {
                on = false;
                System.out.print("Bye");
            }



        }

    }

}