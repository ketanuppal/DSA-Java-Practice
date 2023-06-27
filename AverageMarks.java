import java.util.Scanner;
public class AverageMarks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        char ch = name.charAt(0);
        int m1 = in.nextInt();
        int m2 = in.nextInt();
        int m3 = in.nextInt();
        int avgMarks = (m1 + m2 + m3) / 3;
        System.out.println(ch);
        System.out.println(avgMarks);
    }
}
