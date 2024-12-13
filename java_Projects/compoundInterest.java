/* Name: Md Mehtab, Johan
 * Date: 2024-10-06
 * Description: This program calculates the total amount of money after a compound interest.
 * Input: The principal amount, the rate of interest, and the number of years.
 * Output: The total amount of money after the specified number of years.
 */
import java.util.Scanner;

public class compoundInterest {

	public static void main(final String[] args) {
		CompoundInterest ci = new CompoundInterest();
		System.out.println(ci);
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter the principal amount: ");
			final double principal = input.nextDouble();
			System.out.print("Enter the rate of interest (%): ");
			double rate = input.nextDouble();
			// input.next(); // probably not needed
			// System.out.printf("\b\rEnter the rate of interest: %.2f%%\n", rate);  //doesn't work reliably
			System.out.flush();
			// System.out.print("\b\rRate of interest entered: " + rate + "%\n");  //doesn't work reliably
			rate = rate / 100;
			System.out.print("Enter the number of years: ");
			final double years = input.nextDouble();
			final double interest = principal * rate * Math.pow(1 + rate, years);
			System.out.println("The total after " + years/* .toInt() */ + " years is: " + interest);
		}
	}

	@Override
	public String toString() {
		return "compoundInterest []";
	}
}
