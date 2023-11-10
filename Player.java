import java.util.Scanner;

public class Player {
    private String name;
    private Board board;
    private int score;

    // Constructor
    public Player(String name, Board board) {
        this.name = name;
        this.board = board;
        this.score = 0;
    }

    // Player takes a turn to guess the coordinates on the board
    public boolean takeTurn() {
        Scanner s = new Scanner(System.in);
        System.out.println("Hey " + name + ", Enter Row from 0 - 9: ");
        int x = s.nextInt();
        System.out.println("Hey " + name + ", Enter Column from 0 - 9: ");
        int y = s.nextInt();
        s.nextLine();

        // Validate the input coordinates
        if (x < 0 || x > 9 || y < 0 || y > 9) {
            System.out.println("Invalid input. Please enter coordinates within the range.");
            return takeTurn();
        }

        // Get the square at the guessed coordinates
        Square guess = board.getSquare(x, y);

        // Check if the position has already been hit
        if (guess.isShotFired()) {
            System.out.println("Position has already been hit");
            return false;
        }

        // Mark the square as shot
        guess.shoot();

        // Check if the guessed position has a battleship
        if (guess.isHasShip()) {
            Battleship battleship = guess.getBattleship();
            System.out.println(name + " It's a hit! A " + battleship.getSize() + " unit ship has been damaged.");
            battleship.hit();

            // Check if the battleship is sunk
            if (battleship.isShipSunk()) {
                score++;
                System.out.println("You sunk the battleship! +1 point. Your score is " + getScore());
                if (score == 6) {
                
                	System.out.println("Thats the end of the game");
                	return true;
                }
            }
        } else {
            System.out.println(name + " It's a miss");
        }

        return false;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public Board getBoard() {
        return board;
    }

    public int getScore() {
        return score;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
