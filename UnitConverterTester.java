import java.util.Scanner;

/**
This program tests the UnitConverter class with an interactive menu.
*/
public class UnitConverterTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UnitConverter converter = new UnitConverter();

        System.out.println("Unit Converter");
        System.out.println("Available conversions:");
        System.out.println("  1 - Length (cm, m, km, inch)");
        System.out.println("  2 - Temperature (c, f, k)");
        System.out.print("Choose category (1 or 2): ");
        int category = scanner.nextInt();
        scanner.nextLine(); // consume newline

        if (category != 1 && category != 2) {
            System.out.println("Invalid category.");
            scanner.close();
            return;
        }

        System.out.print("Enter value to convert: ");
        double value = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("From unit: ");
        String fromUnit = scanner.nextLine().trim();

        System.out.print("To unit: ");
        String toUnit = scanner.nextLine().trim();

        double result;
        if (category == 1) {
            result = converter.convertLength(value, fromUnit, toUnit);
            System.out.printf("%.2f %s = %.2f %s%n", value, fromUnit, result, toUnit);
        } else {
            result = converter.convertTemperature(value, fromUnit, toUnit);
            System.out.printf("%.2f %s = %.2f %s%n", value, fromUnit, result, toUnit);
        }

        scanner.close();
    }
}
