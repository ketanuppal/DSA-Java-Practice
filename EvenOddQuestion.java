import java.util.Scanner;
public class EvenOddQuestion {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a % 2 == 0) {
            System.out.println(a + " is Even");
        } else {
            System.out.println(a + " is Odd");
        }
    }
}
