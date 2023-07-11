package labb1;
import java.util.Scanner;

public class rockPaperScissors { public static void startGame() {
    Scanner scanner = new Scanner(System.in);
    int userPoints = 0, computerPoints = 0;

    do {
        System.out.println("\"Spela sten, sax, påse gör ditt val och tryck sedan enter");
        String userMove = scanner.nextLine().toUpperCase();

        int rand = (int) (Math.random() * 3);
        String computerMove = "";

        if (rand == 0) {
            computerMove = "STEN";
        } else if (rand == 1) {
            computerMove = "SAX";
        } else if (rand == 2) {
            computerMove = "PÅSE";
        }
        System.out.println("Motståndarens drag:" + computerMove);

        if (userMove.equals(computerMove)) {
            System.out.println("Lika");
        } else if ((userMove.equals("STEN") && computerMove.equals("SAX")) ||
                (userMove.equals("SAX") && computerMove.equals("PÅSE")) ||
                (userMove.equals("PÅSE") && computerMove.equals("STEN"))) {
            System.out.println("du vann rundan");
            System.out.println();
            userPoints = userPoints + 1;
        } else {
            System.out.println(" du förlorade rundan");
            computerPoints = computerPoints + 1;
        }
    } while(userPoints< 3&&computerPoints< 3);

    if(computerPoints ==3)
        System.out.println("Dator vann sten sax påse");
    else
        System.out.println("Du vann sten sax påse");
}
}
