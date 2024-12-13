import java.util.Scanner;

public class replace_method {
    public static String replace(String str, final char oldChar, final char newChar) {
        String[] strArray = str.split(" ");
        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < strArray[i].length(); j++) {
                if (strArray[i].charAt(j) == oldChar) {
                    strArray[i] = strArray[i].replace(oldChar, newChar);
                }
            }
        }
        // String modifiedString = strArray.toString();
        return str;
    }

    public static void main(final String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a string: ");
            String str = sc.nextLine();
            System.out.println("Enter the character you want to change(only 1st chracter will be taken): ");
            final char oldChar = sc.next().charAt(0);
            System.out.println("Enter the new character to replace with(only 1st chracter will be taken): ");
            final char newChar = sc.next().charAt(0);
            String modifiedString = replace(str, oldChar, newChar);
            System.out.println("The string after replacing the characters is: " + modifiedString);
        }
    }
}
