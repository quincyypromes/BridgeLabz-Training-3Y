import java.util.*;

public class SalesDashboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] sales = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter sales for day " + (i + 1) + ": ");
            sales[i] = sc.nextInt();
        }

        int total = 0;
        int max = sales[0];
        int maxDay = 1;
        boolean zeroSales = false;

        for (int i = 0; i < 10; i++) {
            total += sales[i];
            if (sales[i] > max) {
                max = sales[i];
                maxDay = i + 1;
            }
            if (sales[i] == 0) {
                zeroSales = true;
            }
        }

        System.out.println("Total sales: " + total);
        System.out.println("Day with maximum sales: Day " + maxDay + " (" + max + ")");
        if (zeroSales) {
            System.out.println("There was at least one day with zero sales (holiday).");
        } else {
            System.out.println("No day had zero sales.");
        }

        sc.close();
    }
}
