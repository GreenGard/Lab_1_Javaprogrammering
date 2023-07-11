package labb1;
import java.util.Scanner;

public class Labb1 {
    public static void main(String[] args){
        meny();
    }
    static Scanner scanner = new Scanner(System.in);

    public static void meny(){
        String number;

        do {
            System.out.println("[1] Upp och ner \n[2] MinMax \n[3] Sten Sax Påse \n[4] Ordning och Reda");
            System.out.print(" Välj ett spel: ");
            number = scanner.next().toUpperCase();

            switch (number) {
                case "1":
                    upAndDown.startGame();
                    break;
                case "2":
                    minMax.startGame();
                    break;
                case "3":
                    rockPaperScissors.startGame();
                    break;
                case "4":
                    sortAndOrder.startGame();
                    break;
                case "E":
                    break;
                default:
                    System.out.println("Unexpected value: " + number);
                    break;
            }
        }while (!number.equals("E"));
    }
}

