import java.util.Scanner;
public class LargestOf2 {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int a, b;
        System.out.print("Enter first number(a): ");
        a = in.nextInt();
        System.out.print("Enter second number(b): ");
        b = in.nextInt();
        if (a > b){
            System.out.println(a + " is greater than " + b);
        } else if (a < b){
            System.out.println(b + " is greater than " + a);
        } else{
            System.out.println("Both a and b are equal!");
        }
    }
}
