/**
 * 
 */
public class reviewAssignment {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    System.out.println("the sum of 10 and 20 is " + (a + b));
    a = 9;
    b = 3;
    double c = a / b;
    System.out.println("9/3 = " + c);
    a = 10;
    b = 4;
    c = a % b;
    System.out.println("the remainder of 10 / 4 is " + c);
    String s = """

            J    /a\\   \\v     v/  /a\\
            J   /a a\\   \\v   v/  /a a\\
        J   J  /aaaaa\\   \\V V/  /aaaaa\\
         JJJ  /a     a\\   \\V/  /a     a\\
        """;
    System.out.println(s);
    s = """

           +\"\"\"\"\"+
          [| o o |]
           |  ^  |
           | '-' |
           +-----+

        """;
    System.out.println(s);

  }
}
// J /a\ \v v/ /a\
// J /a a\ \v v/ /a a\
// J J /aaaaa\ \V V/ /aaaaa\
// JJJ /a a\ \V/ /a a\
