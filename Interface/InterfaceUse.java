package Interface;

public class InterfaceUse implements InterfaceEx{

    public void method1(){
        System.out.println("Implementation of method 1");
    }

    public static void main(String args[]){
        InterfaceUse obj = new InterfaceUse();
        obj.method1();
    }
}
