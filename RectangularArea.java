import java.util.Scanner;
public class RectangularArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        int area = (x2 - x1) * (y2 - y1);
        System.out.println(area);
    }
}
