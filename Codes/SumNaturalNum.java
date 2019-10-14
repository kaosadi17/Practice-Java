package Codes;

import java.util.Scanner;

public class SumNaturalNum {

    public static void main(String args[]){

        int num;
        int total = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the last number that you want to get SUM ");
        num = scan.nextInt();

        for (int i =1; i<=num; i++){
            total = total+i;
        }

        System.out.println("Output is: "+total);
    }
}
