import java.util.Scanner;
public class SimpleInterest {
    public static void main(String []args){
    Scanner in = new Scanner(System.in);
    int P = in.nextInt();
    double R = in.nextDouble();
    int T = in.nextInt();
    int SI = (int)(P * R * T) / 100;
    System.out.println(SI);
    }
}
