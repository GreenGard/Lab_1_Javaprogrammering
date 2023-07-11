package labb1;
import java.util.Arrays;
import java.util.Scanner;

public class sortAndOrder {
    public static void startGame() {
    Scanner scanner = new Scanner(System.in);
    int[] fiveNumbers = new int[5];
    int sum = 0;

    System.out.println(" Ange 5 heltal");

    for (int i = 0; i < fiveNumbers.length; i++) {
        fiveNumbers[i] = scanner.nextInt();
        sum += fiveNumbers[i];
    }

    System.out.print(("sort:\n"));
    Arrays.sort(fiveNumbers, 0, fiveNumbers.length);
    System.out.println("Min value:" + fiveNumbers[0] + "\n2Min value:" + fiveNumbers[1] + "\n2Max value:" + fiveNumbers[fiveNumbers.length - 2] + "\nMax value:" + fiveNumbers[fiveNumbers.length - 1] + "\nSumma: " + sum);
}
}