
/* Name: Md Mehtab, Johan
 * Date: 2024-10-10
 * Description: This program calculates the total amount of money after a compound interest.
 * Input: The principal amount, the rate of interest, and the number of years.
 * Output: The total amount of money after the specified number of years.
*/
import java.util.Scanner;
import java.util.ArrayList;

public class palindrome {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String text = input.nextLine();
            String Tex = text;
            text = text.toLowerCase();
            char[] charArray = text.toCharArray();
            final char[] textAlphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
                    'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
            ArrayList<Character> newCharArray = new ArrayList<>();
            for (int j = 0; j < charArray.length; j++) {
                for (int i = 0; i < textAlphabet.length; i++) {
                    if (charArray[j] == textAlphabet[i]) {
                        newCharArray.add(charArray[j]);
                    }
                }
            }
            boolean isPalindrome = true;
            // charArray = ArrayList.toArray(newCharArray);
            // System.out.println(newCharArray.size());
            // System.out.println(newCharArray);
            for (int i = 0; i < newCharArray.size() / 2; i++) {
                if (newCharArray.get(i) != newCharArray.get(newCharArray.size() - i - 1)) {
                    System.out.println("The string "+ "'"+Tex+"'"+" is not a palindrome");
                    isPalindrome = false;
                    // System.exit(0);
                    break;
                }
            }
            if (isPalindrome) {
                // System.out.println("Palindrome");
                // System.out.println("The string is a palindrome");
                System.out.println("The string "+ "'"+Tex+"'"+" is a palindrome");
            }
        }
    }
}
