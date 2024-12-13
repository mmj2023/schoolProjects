/* Name: Md Mehtab, Johan
 * Date: 2024-10-06
 * Description: This program calculates the sum of the squares of the numbers from 1 to n.
 * Input: A positive integer n.
 * Output: The sum of the squares of the numbers from 1 to n.
*/

import java.util.Scanner;

public class rangeSum {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter a number(Only positive integers): ");
			int n = sc.nextInt();
			int sum = 0;
			if (n < 0) {
				System.out.println("Invalid input");
				return;
			} else if (n == 0) {
				System.out.println("0");
				return;
			} else if (n == 1) {
				System.out.println("1");
				return;
			} else {
				for (int i = n; i >= 0; i--) {
					sum += Math.pow(i, 2);
				}
				System.out.println(sum);
			}
		}
	}

}
