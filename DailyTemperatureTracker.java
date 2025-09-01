import java.util.*;

public class DailyTemperatureTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] temps = new int[7];

        for (int i = 0; i < 7; i++) {
            System.out.print("Enter temperature for day " + (i + 1) + ": ");
            temps[i] = sc.nextInt();
        }

        int sum = 0;
        int max = temps[0];
        int min = temps[0];

        for (int temp : temps) {
            sum += temp;
            if (temp > max) max = temp;
            if (temp < min) min = temp;
        }

        double average = sum / 7.0;

        System.out.println("Average temperature: " + average);
        System.out.println("Highest temperature: " + max);
        System.out.println("Lowest temperature: " + min);
        System.out.println("Temperatures above average:");
        for (int temp : temps) {
            if (temp > average) {
                System.out.println(temp);
            }
        }

        sc.close();
    }
}
