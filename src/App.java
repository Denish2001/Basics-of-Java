import java.util.*;
import java.awt.*;
import java.text.NumberFormat;

public class App {
    public static void main(String[] args) throws Exception {
        final byte MONTHS_IN_YEARS = 12;
        final byte PERCENT = 100;
        double Principle = 0;
        float intrest = 0;
        byte Years = 0;
        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.print("Principle ( $1K - $1M): ");
            Principle = scan.nextDouble();
            if (Principle >= 1000 && Principle <= 1_000_000)
                break;
            System.out.println("Enter a value Between 1000 and 1000000");
        }

        while (true) {
            System.out.print("Annual Intrest rate: ");
            intrest = scan.nextFloat();
            if (intrest >= 0 && intrest <= 30)
                break;
            System.out.println("Enter a value between 1 and 30");
        }

        float monthlyIntrest = intrest / PERCENT / MONTHS_IN_YEARS;

        while (true) {
            System.out.print("Period in Years: ");
            Years = scan.nextByte();
            if (Years >= 0 && Years <= 30)
                break;
            System.out.println("Enter a value between 1 and 30");
        }

        int numberOfPayments = Years * MONTHS_IN_YEARS;

        double mortgage = Principle * (monthlyIntrest * Math.pow(1 + monthlyIntrest, numberOfPayments)) /
                (Math.pow(1 + monthlyIntrest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);

    }
}
