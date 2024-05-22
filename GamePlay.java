import java.util.Scanner;

public class GamePlay {
    public static void main(String[] args) {
        // Create a game board with 10 rows and 10 columns
        Board board = new Board(10, 10);

        // Prompt for player names
        System.out.println("Welcome to the Battleship game. ");
        System.out.println("Player one, Enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.nextLine();

        System.out.println("Player two, Enter your name:");
        String name2 = scanner.nextLine();

        // Create two players with the entered names and the same game board
        Player one = new Player(name1, board);
        Player two = new Player(name2, board);

        // Populate the game board with ships
       // board.populateBoard();
        board.generateBattleships();

        // Display the initial state of the board
        System.out.println(board);

        // Game loop
        boolean gameInProgress = true;
        while (gameInProgress) {
            // Player one takes a turn and updates the board
            one.takeTurn();
            System.out.println(board);

            // Player two takes a turn and updates the board
            two.takeTurn();
            System.out.print(board);

            // Check for game end conditions

            // If player one has more points and the total number of ships sunk is 6, player one wins
            if (one.getScore() > two.getScore() && (one.getScore() + two.getScore()) == 6) {
                System.out.println("That is the end of the Game: Congratulations, " + one.getName() + "! You've won the game with " + one.getScore() + " points");
                break;
            }
            // If player two has more points and the total number of ships sunk is 6, player two wins
            else if (two.getScore() > one.getScore() && (one.getScore() + two.getScore()) == 6) {
                System.out.println("That is the end of the Game: Congratulations, " + two.getName() + "! You've won the game with " + two.getScore() + " points");
                break;
            }
            // If it's a draw and the total number of ships sunk is 6, it's a draw
            else if (one.getScore() == two.getScore() && (one.getScore() + two.getScore()) == 6) {
                System.out.println("That is the end of the Game: It's a draw! You both scored 3 points");
                break;
            }
        }
    }
}
