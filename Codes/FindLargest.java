public class FindLargest{
    public static void main(String args[]){
        int num1 = 20;
        int num2 = 70;
        int num3 = 10;

        if(num1>= num2){
            if(num1>=  num3){
                System.out.println("The largest number is"+num1);
            }
            else{
                System.out.println("The largest number is"+num3);
            }
            
        }
        else{
            if (num2>=num3){
                System.out.println("The largest number is"+num2);
            }
            else{
                System.out.println("The largest number is"+num3);
            }
        }
    }
}
