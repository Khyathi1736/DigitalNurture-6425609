import java.util.Scanner;

public class FinancialForecast {

    // Function to forecast balance over a number of years with interest
    public static void forecast(double initialAmount, double annualRate, int years) {
        System.out.println("\nYear\tProjected Balance");
        System.out.println("-----------------------------");
        double balance = initialAmount;

        for (int i = 1; i <= years; i++) {
            balance = balance + (balance * annualRate / 100);
            System.out.printf("%d\t%.2f%n", i, balance);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial investment amount (₹): ");
        double initialAmount = sc.nextDouble();

        System.out.print("Enter annual interest/growth rate (%): ");
        double annualRate = sc.nextDouble();

        System.out.print("Enter number of years to forecast: ");
        int years = sc.nextInt();
        sc.close();

        forecast(initialAmount, annualRate, years);
    }
}
