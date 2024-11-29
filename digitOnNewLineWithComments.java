/* Name: Md Mehtab, Johan
 * Date: 2024-10-10
 * Description: This program calculates the total amount of money after a compound interest.
 * Input: The principal amount, the rate of interest, and the number of years.
 * Output: The total amount of money after the specified number of years.
 */
import java.util.Scanner;

public class digitOnNewLine {

    public static void main(final String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a number (Only positive numbers): ");
            final double number = input.nextDouble();
            final String textNum = String.valueOf(number);
            final char[] textNumArray = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
            for (int i = 0; i < textNum.length(); i++) {
                for (int j = 0; j < textNumArray.length; j++) {
                    if (textNum.charAt(i) == textNumArray[j]) {
                        System.out.print(textNum.charAt(i) + "\n");
                    }
                }
            }
        }

    }
}
