import java.util.Scanner;
public class Greetings {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.println("Hello There, " + name + "!" + " How are you doing today?");
    }
}
