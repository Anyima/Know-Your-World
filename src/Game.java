import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);
    private int numLevel1 = 2;
    private int numLevel2 = 2;
    private int numLevel3 = 2;

    public static void main(String[] args) {
        Game newGame = new Game();
        newGame.displayMenu();
    }

    public void displayMenu() {
        System.out.print("Please pick an option: \n" +
                "1: Start Game\n" +
                "2: Quit\n");
        int answer = input.nextInt();
        switch (answer) {
            case 1:
                startGame();
                break;
            case 2:
                break;
            default:
                System.out.println("That was not an accepted input.");
                break;
        }
//        if (answer == 1) {
//            startGame();
//        } else if (answer == 2) {
//
//        } else {
//            System.out.println("That was not an accepted input.");
//        }
    }

    public void startGame() {
        System.out.println("Game Started");
        Level1 firstLevel = new Level1(numLevel1);
        firstLevel.playLevel1();
        Level2 secondLevel = new Level2(numLevel2);
        secondLevel.playLevel2();
    }
}

