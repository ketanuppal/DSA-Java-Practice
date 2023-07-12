import java.text.DecimalFormat;
// the decimal format class(imported)
import java.util.Scanner;
public class RupeeToUSD {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        double rupee, usd;
        System.out.print("Enter money in Rupees(Rs.): ");
        rupee = in.nextDouble();
        usd = rupee / 82.26;

        //created and object df of the DeciamlFormat class!
        DecimalFormat df = new DecimalFormat();

        //using function/property setMinimumFractionDigits() on df, to specify the round off after decimal!
        df.setMinimumFractionDigits(3);

        System.out.println(rupee + " INR will be " + df.format(usd) + " USD!");
    }
}
