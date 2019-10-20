package Codes;

import java.util.Scanner;

public class VowelConstant {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the character to scan");
        char ch = scan.next().charAt(0);
        scan.close();

        Boolean isVowel = false;

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                isVowel = true;
        }

        if (isVowel == true) {
            System.out.println(ch + " is a Vowel");
        } else {
            if((ch >= 'a' && ch<='z')|| (ch>='A' && ch<='Z')){
                System.out.println(ch+" is a Constant");
            }
            else {
                System.out.println("Invalid input");
            }
        }
    }
}
