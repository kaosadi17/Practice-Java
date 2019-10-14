package Codes;

import java.util.Scanner;

public class Calculator {
    public  static void main(String args[]){


        double num1, num2;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        num1 = scan.nextDouble();

        System.out.println("Enter the second number");
        num2 = scan.nextDouble();

        System.out.println("Enter an operator (+,-,/,*)");
        char opr = scan.next().charAt(0);

        scan.close();
        double output;

        switch (opr){
            case '+':
                output = num1+num2;
                break;
            case '-':
                output = num1-num2;
                break;
            case '*':
                output = num1 * num2;
                break;
            case '/':
                output=num1/num2;
                break;
                default:
                    System.out.println("You have entered a wrong operator");
                    return;

        }

        System.out.println(num1+" "+opr+" "+num2+" = "+ output);

    }
}
