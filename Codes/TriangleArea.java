import java.util.Scanner;

public class TriangleArea{
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the base value");

        int base = scan.nextInt();

        System.out.print("Enter the height value");

        int height = scan.nextInt();

        double area = (base * height)/2;

        System.out.println("Area of a triangle "+ area);

    }
}
