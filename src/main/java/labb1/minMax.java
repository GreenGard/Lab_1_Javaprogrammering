package labb1;
import java.util.Scanner;

public class minMax { public static void startGame() {
    int[] fiveNumbers = new int[5];
    int largest = Integer.MIN_VALUE;
    int least = Integer.MAX_VALUE;
    Scanner scanner = new Scanner(System.in);

    System.out.println(" Ange 5 heltal");

    for (int i = 0; i < fiveNumbers.length; i++) {
        fiveNumbers[i] = scanner.nextInt();

        if (fiveNumbers[i] > largest)
            largest = fiveNumbers[i];
        if (fiveNumbers[i] < least)
            least = fiveNumbers[i];
    }

    System.out.println("Största talet är: " + largest);
    System.out.println("Det minsta talet är: " + least);
}
}