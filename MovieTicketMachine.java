import java.util.*;

public class MovieTicketMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter ticket category (Silver, Gold, Platinum) or 'exit' to quit: ");
            String category = sc.nextLine();
            if (category.equalsIgnoreCase("exit")) break;

            System.out.print("Enter number of tickets: ");
            int count = Integer.parseInt(sc.nextLine());

            double price = 0;
            switch (category.toLowerCase()) {
                case "silver": price = 120; break;
                case "gold": price = 180; break;
                case "platinum": price = 250; break;
                default:
                    System.out.println("Invalid category.");
                    continue;
            }

            double total = price * count;
            double serviceCharge = total * 0.05;
            double finalBill = total + serviceCharge;

            System.out.println("Total (including service charge): ₹" + finalBill);
        }

        sc.close();
    }
}
