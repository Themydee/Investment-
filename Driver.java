import java.util.Scanner;

public class Driver {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your buying price per share: ");
        double buyingPrice = sc.nextDouble();

        int day = 1;
        double closingPrice = 0.1;

        while (true) {
            System.out.println("Enter the closing price for the day: " + day + " any negative value to leave: ");

            closingPrice = sc.nextDouble();
            if(closingPrice < 0.0) break;

            double earnings = closingPrice - buyingPrice;
            if (earnings > 0.0) {
                System.out.println("After day" + day  + ", you earrned " + earnings + " per share ");
            }
            else if (earnings < 0.0) {
                System.out.println("After day" + day + ", you lost " + (-earnings) + " per share ");

            }

        }
    }
}
