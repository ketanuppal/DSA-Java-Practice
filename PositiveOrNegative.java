import java.util.Scanner;
public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n < 0){
            System.out.println("Negative");
        } else{
            System.out.println("Positive");
        }
    }
}
