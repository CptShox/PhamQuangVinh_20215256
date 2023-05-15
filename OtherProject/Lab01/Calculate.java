import java.util.Scanner;

public class Calculate {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Write two numbers: ");
        double a = keyboard.nextDouble();
        double b = keyboard.nextDouble();
        System.out.println("Tong la: "+(a+b));
        System.out.println("Hieu la: "+(a-b));
        System.out.println("Tich la: "+(a*b));
        System.out.println("Thuong la: "+(a/b));
    }
}