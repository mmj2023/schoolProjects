import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class maze {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String fileName = sc.nextLine();
            List<String> lines = new ArrayList<>();
            List<String> chars = new ArrayList<>();
            chars.add("a");
            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                String line;
                Integer col = Integer.parseInt(br.readLine());
                Integer row = Integer.parseInt(br.readLine());
                while ((line = br.readLine()) != null) {
                    lines.add(line);
                    // System.out.println(line);
                }
                for (int i = 0; i < row; i++) {
                    // System.out.println(lines.get(i));
                    for (int j = 0; j < col; j++) {
                        System.out.print(lines.get(i).charAt(j));
                    }
                    System.out.println();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
