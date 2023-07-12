import java.util.Scanner;
public class SubtractProdAndSumOfDigitsOfInt {
    public static int subtractProductAndSum(int n) {
        int prodOfDigits = 1, sumOfDigits = 0;
        while (n > 0){
                int digit = n  % 10;
                prodOfDigits *= digit;
                sumOfDigits += digit;
                n /= 10;
        }
        return prodOfDigits - sumOfDigits;
    }
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = subtractProductAndSum(n);
        System.out.println(result);

    }
}

