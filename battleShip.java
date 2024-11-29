import java.util.Scanner;

public class battleShip {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			int ships = sc.nextInt();
			int[] shipsArray = new int[ships];
			for (int i = 0; i < ships; i++) {
			    shipsArray[i] = sc.nextInt();
			}
			int[] hits = new int[ships];
			for (int i = 0; i < ships; i++) {
			    hits[i] = sc.nextInt();
			}
			int[] damage = new int[ships];
			for (int i = 0; i < ships; i++) {
			    damage[i] = sc.nextInt();
			}
			int[] hitsArray = new int[ships];
			for (int i = 0; i < ships; i++) {
			    hitsArray[i] = hits[i];
			}
			int[] damageArray = new int[ships];
			for (int i = 0; i < ships; i++) {
			    damageArray[i] = damage[i];
			}
			// int[] hitsArray2 = new
		}
    }}
