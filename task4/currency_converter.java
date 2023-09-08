package task4;
import java.util.Scanner;

public class currency_converter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Currency Converter!");

        while (true) {
            System.out.println("Select the base currency:");
            System.out.println("1. USD (United States Dollar)");
            System.out.println("2. EUR (Euro)");
            System.out.println("3. INR (Indian Rupee)");
            System.out.println("4. YEN (Japanese Yen)");
            System.out.println("5. CAD (Canadian Dollar)");
            System.out.println("6. YUAN (Chinese Yuan)");
            System.out.println("0. Exit");

            int baseCurrencyChoice = getChoice(scanner);

            if (baseCurrencyChoice == 0) {
                break;
            }

            int targetCurrencyChoice = getTargetCurrencyChoice(scanner);

            double amount = getAmount(scanner);

            double convertedAmount = convertCurrency(baseCurrencyChoice, targetCurrencyChoice, amount);

            System.out.println("Converted amount: " + convertedAmount);

            System.out.print("Do you want to convert another amount? (yes/no): ");
            String response = scanner.next().toLowerCase();

            if (!response.equals("yes")) {
                break;
            }
        }

        System.out.println("Thank you for using Currency Converter!");
        scanner.close();
    }

    private static int getChoice(Scanner scanner) {
        int choice;
        while (true) {
            System.out.print("Enter your choice: ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice >= 0 && choice <= 6) {
                    break;
                }
            } else {
                scanner.next(); // Consume invalid input
            }
            System.out.println("Invalid choice. Please select a valid option.");
        }
        return choice;
    }

    private static int getTargetCurrencyChoice(Scanner scanner) {
        int targetChoice;
        while (true) {
            System.out.println("Select the target currency:");
            System.out.println("1. USD (United States Dollar)");
            System.out.println("2. EUR (Euro)");
            System.out.println("3. INR (Indian Rupee)");
            System.out.println("4. YEN (Japanese Yen)");
            System.out.println("5. CAD (Canadian Dollar)");
            System.out.println("6. YUAN (Chinese Yuan)");

            System.out.print("Enter your choice: ");
            if (scanner.hasNextInt()) {
                targetChoice = scanner.nextInt();
                if (targetChoice >= 1 && targetChoice <= 6) {
                    break;
                }
            } else {
                scanner.next(); // Consume invalid input
            }
            System.out.println("Invalid choice. Please select a valid target currency.");
        }
        return targetChoice;
    }

    private static double getAmount(Scanner scanner) {
        double amount;
        while (true) {
            System.out.print("Enter the amount to convert: ");
            if (scanner.hasNextDouble()) {
                amount = scanner.nextDouble();
                if (amount >= 0) {
                    break;
                }
            } else {
                scanner.next(); // Consume invalid input
            }
            System.out.println("Invalid amount. Please enter a non-negative number.");
        }
        return amount;
    }

    private static double convertCurrency(int baseCurrencyChoice, int targetCurrencyChoice, double amount) {
        double conversionRate = 0.0;

        switch (baseCurrencyChoice) {
            case 1: // USD (United States Dollar)
                switch (targetCurrencyChoice) {
                    case 1: // USD to USD
                        conversionRate = 1.0;
                        break;
                    case 2: // USD to EUR
                        conversionRate = 0.85;
                        break;
                    case 3: // USD to INR
                        conversionRate = 74.11;
                        break;
                    case 4: // USD to YEN
                        conversionRate = 108.62;
                        break;
                    case 5: // USD to CAD
                        conversionRate = 1.26;
                        break;
                    case 6: // USD to YUAN
                        conversionRate = 6.45;
                        break;
                }
                break;
            case 2: // EUR (Euro)
                switch (targetCurrencyChoice) {
                    // Add conversion rates for EUR here
                }
                break;
            case 3: // INR (Indian Rupee)
                switch (targetCurrencyChoice) {
                    // Add conversion rates for INR here
                }
                break;
            case 4: // YEN (Japanese Yen)
                switch (targetCurrencyChoice) {
                    // Add conversion rates for YEN here
                }
                break;
            case 5: // CAD (Canadian Dollar)
                switch (targetCurrencyChoice) {
                    // Add conversion rates for CAD here
                }
                break;
            case 6: // YUAN (Chinese Yuan)
                switch (targetCurrencyChoice) {
                    // Add conversion rates for YUAN here
                }
                break;
        }
        
        return amount * conversionRate;
    }
}
