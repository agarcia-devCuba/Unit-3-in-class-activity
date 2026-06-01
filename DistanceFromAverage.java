import java.util.Scanner;

public class DistanceFromAverage {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int MAX = 15;
        final double SENTINEL = 99999;

        double[] values = new double[MAX];
        int count = 0;

        System.out.println("=== Distance From Average ===");
        System.out.println("Enter up to " + MAX + " double values.");
        System.out.println("Type " + (int) SENTINEL + " to stop.\n");

        // TODO 1: Loop while count < MAX
        while (count < MAX) {
            System.out.print("Enter value " + (count + 1) + ": ");
            double val = input.nextDouble();

            // If sentinel entered, stop loop
            if (val == SENTINEL) {
                break;
            }

            // Store value and increment count
            values[count] = val;
            count++;
        }

        // TODO 2: If count == 0, print error and exit
        if (count == 0) {
            System.out.println("\nError: No numbers entered.");
            input.close();
            return;
        }

        // TODO 3: Compute average
        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum += values[i];
        }
        double average = sum / count;

        // TODO 4: Display results
        System.out.println("\n--- Results ---");
        System.out.println("Count   : " + count);
        System.out.printf("Average : %.2f%n", average);
        System.out.println("\nValue      Distance from Average");
        System.out.println("---------- ----------------------");
        for (int i = 0; i < count; i++) {
            double distance = values[i] - average;
            System.out.printf("%-10.2f %+.2f%n", values[i], distance);
        }

        input.close();
    }
}