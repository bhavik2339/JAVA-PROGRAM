import java.util.Scanner;

class dollartorupee 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount in USD: ");
        double usd = sc.nextDouble();

        double inr = usd * 83;
        System.out.println("INR = " + inr);
    }
}
