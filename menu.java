import java.util.Scanner;

public class GroceryStore {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // double apples = 1.50;
        // double bread = 2.00;
        // double milk = 3.00;
        // double eggs = 2.50;
        // double cheese = 4.00;
        double prices[] = { 1.50, 2.00, 3.00, 2.50, 4.00 };
        String itemNames[] = { "Apples", "Bread", "Milk", "Eggs", "Cheese" };
        String dashBoard = """
                +------------------------------------------------------------------------------+
                |  ### Welcome to the Grocery Store! ###                                       |
                |  Please enter the number of the item you would like to purchase and along    |
                |  with it include the quantity and when done press 6 to exit.                 |
                |  1. Apples per piece :$1.50                                                  |
                |  2. Bread sticks per piece :$2.00                                            |
                |  3. Milk packets per piece :$3.00 (1 packet = 1 liter)                       |
                |  4. Eggs per piece :$2.50                                                    |
                |  5. Cheese per piece :$4.00  (1 piece = 125 grams)                           |
                |  6. Exit                                                                     |
                +------------------------------------------------------------------------------+
                """;
        System.out.println(dashBoard);
        System.out.println(
                "Please enter the number of the item you would like to purchase (only enter a number between 1 and 6): ");
        int choice;
        int amount;
        double currentAmount;
        double sum = 0;
        while (true) {
            choice = input.nextInt();
            if (choice == 6) {
                if (sum > 0) {
                    System.out
                            .println("Exiting the store...The final total is $" + sum + "\nThe added tax will be $"
                                    + (sum * 0.13) + "\nThe subtotal will be $" + (sum * 1.13) + " including taxes");
                    break;
                } else {
                    System.out.println("Exiting the store...You have not purchased any items.");
                    input.close();
                    System.exit(0);
                }
            } else if (choice < 1 || choice > 6) {
                System.out.println("Invalid input.Please enter a number between 1 and 5 to continue or 6 to exit :");
            } else if (choice >= 1 || choice < 6) {
                System.out.println("You have chosen " + itemNames[choice - 1] + "\nThe price of it is $"
                        + prices[choice - 1] + " per piece.How many would you like to buy?: ");
                amount = input.nextInt();
                currentAmount = amount * prices[choice - 1];
                System.out.println("Total price of the selected item will be $" + currentAmount);
                sum += currentAmount;
                System.out.println("Your current total is $" + sum);
                System.out.println(
                        "if you would like to continue purchasing items press the index of the item otherwise press 6 : ");
            } else {
                System.out.println("Invalid input.Please enter a number between 1 and 5 to continue or 6 to exit :");
            }
        }
        System.out.println(
                "You have to pay $" + (sum * 1.13) + " Please enter the amount of money you would like to pay with : ");
        double remainingAmount = (sum * 1.13);
        int numberOfCurrencies;
        while (true) {
            currentAmount = input.nextDouble();
            if (currentAmount < (sum * 1.13) && remainingAmount > 0) {
                remainingAmount -= currentAmount;
                System.out.println("Remaining amount $" + remainingAmount);
                if (remainingAmount < 0) {
                    remainingAmount *= -1;
                    double currencies[] = { 20.00, 10.00, 5.00, 2.00, 1.00, 0.50, 0.25, 0.10, 0.05 };
                    // for (int i = 0; ; i++) {
                    // if (currentAmount >= currencies[i - 1]) {
                    // currentAmount -= currencies[i - 1];
                    // // break;
                    // }
                    // }
                    System.out.println("The due change is $" + remainingAmount
                            + " and the change will be paid in the following currencies:");
                    for (int i = 0; i < currencies.length; i++) {
                        numberOfCurrencies = 0;
                        while (remainingAmount >= currencies[i]) {
                            remainingAmount -= currencies[i];
                            numberOfCurrencies += 1;
                        }
                        if (numberOfCurrencies > 0) {
                            System.out.println((i + 1) + " : $" + currencies[i] + " x " + numberOfCurrencies);
                        }
                    }
                    break;
                }
            } else {
                System.out.println("Thank you for using the store.Have a nice day!");
                break;
            }
        }
    }
}
