package Codes;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String args[]){

        int num1 = 0, num2 = 1, count;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        count = scan.nextInt();
        System.out.println("Fibonacci series: ");

        for (int i=0; i<count;i++){
            System.out.println(num1+" ");

            int total = num1+num2;
            num1 = num2;
            num2 = total;
        }
    }
}
