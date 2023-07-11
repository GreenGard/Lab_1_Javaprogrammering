package labb1;
import java.util.Scanner;

public class upAndDown {
    public static void startGame() {
    Scanner scanner = new Scanner(System.in);
    String[] upAndDown = new String[3];

    for (int i = 0; i < upAndDown.length; i++) {
        System.out.println("Skriv ett ord");
        upAndDown[i] = scanner.nextLine();
    }

    for (int i = 0; i < upAndDown.length; i++) {
        System.out.println(upAndDown[i]);
    }
    System.out.println("end");
    for (int i = 0; i < upAndDown.length; i++) {
        System.out.println(upAndDown[upAndDown.length - (i + 1)]);
    }
}
}
