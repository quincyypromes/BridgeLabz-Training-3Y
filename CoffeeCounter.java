import java.util.*;

public class CoffeeCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter coffee type (Espresso, Latte, Cappuccino) or 'exit' to quit: ");
            String coffeeType = sc.nextLine();
            if (coffeeType.equalsIgnoreCase("exit")) break;

            System.out.print("Enter quantity: ");
            int quantity = Integer.parseInt(sc.nextLine());

            double price = 0;
            switch (coffeeType.toLowerCase()) {
                case "espresso": price = 100; break;
                case "latte": price = 150; break;
                case "cappuccino": price = 200; break;
                default:
                    System.out.println("Invalid coffee type.");
                    continue;
            }

            double total = price * quantity;
            double gst = total * 0.18;
            double finalBill = total + gst;

            System.out.println("Total (including GST): ₹" + finalBill);
        }

        sc.close();
    }
}
