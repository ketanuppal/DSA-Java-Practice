import java.sql.SQLOutput;
import java.util.Scanner;
public class PrintASCIIValue {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        String temp = in.next();
        char ch = temp.charAt(0);
        int asciiValue = ch;
        System.out.println(asciiValue);
    }
}
