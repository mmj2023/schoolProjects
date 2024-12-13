/* Name: Md Mehtab, Johan
 * Date: 2024-11-21
 * Description: This program converts a string to an acronym.
 * Input: The string to be converted.
 * Output: The acronym.
*/
import java.util.Scanner;

public class acronym {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        // char[] ch = str.toCharArray();
        // for (int i = 0; i < ch.length; i++) {
        // if (Character.isUpperCase(ch[i])) {
        // System.out.print(Character.toUpperCase(ch[i]));
        // } else {
        // System.out.print(Character.toLowerCase(ch[i]));
        // }
        // }
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            // if (Character.isUpperCase(words[i].charAt(0))) {
            // System.out.print(Character.toUpperCase(words[i].charAt(0)));
            // } else {
            // System.out.print(Character.toLowerCase(words[i].charAt(0)));
            // }
            System.out.print(Character.toString(words[i].charAt(0)).toUpperCase());
        }
    }
}
