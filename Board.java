import java.util.Random;

public class Board {
    // Attributes
    private int numRows;
    private int numColumns;
    private Square[][] grid;

    // Constructor
    public Board(int row, int column) {
        // Initialize the board with the specified number of rows and columns
        this.numRows = row;
        this.numColumns = column;
        this.grid = new Square[row][column];
    }

    // Override the toString method to display the board
    public String toString() {
        // Printing the board with row and column labels
        StringBuilder output = new StringBuilder("   0 1 2 3 4 5 6 7 8 9\n");
        output.append(" +-------------------\n");

        for (int i = 0; i < grid.length; i++) {
            // Add row number
            output.append(i).append("| ");

            for (int j = 0; j < grid[i].length; j++) {
                // Append the content of the cell in a more readable format
                output.append(grid[i][j] == null ? "~" : grid[i][j]).append(" ");
            }
            output.append("\n");
        }
        return output.toString();
    }

    // Initialise the grid with Square objects
    public void populateBoard() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = new Square(i, j);
            }
        }
    }

    // Generate battleships on the board
    public void generateBattleships() {
        Random r = new Random();

        // Generate medium, large, and small battleships
        generateShipsOfType(MediumBattleship.class, MediumBattleship.numberOfShips, r);
        generateShipsOfType(LargeBattleship.class, LargeBattleship.numberOfShips, r);
        generateShipsOfType(SmallBattleship.class, SmallBattleship.numberOfShips, r);
    }

    // Generate battleships of a specific type
    private void generateShipsOfType(Class<? extends Battleship> battleshipType, int shipNumbers, Random r) {
        for (int i = 0; i < shipNumbers; i++) {
            Battleship ship;
            try {
                // Create an instance of the specified battleship type
                ship = battleshipType.getDeclaredConstructor().newInstance();
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }

            int size = ship.getSize();
            boolean isVertical = r.nextBoolean();

            int shipRow, shipColumn;
            do {
                // Randomly select a starting position for the battleship i.e from 0 to the numRows or numColums which will be 10
                shipRow = r.nextInt(numRows);
                shipColumn = r.nextInt(numColumns);
            } while (!isValidPlacement(shipRow, shipColumn, size, isVertical));

            for (int j = 0; j < size; j++) {
                // Place the battleship on the board
                if (isVertical) {
                    grid[shipRow + j][shipColumn].setBattleship(ship);
                } else {
                    grid[shipRow][shipColumn + j].setBattleship(ship);
                }
            }
        }
    }

    // Check if the placement of a battleship is valid
    public boolean isValidPlacement(int shipRow, int shipColumn, int size, boolean isVertical) {
        if (isVertical) {
            if (shipRow + size > numRows) {
                return false;
            }

            for (int i = 0; i < size; i++) {
                if (grid[shipRow + i][shipColumn].isHasShip()) {
                    return false;
                }
            }
        } else {
            if (shipColumn + size > numColumns) {
                return false;
            }

            for (int i = 0; i < size; i++) {
                if (grid[shipRow][shipColumn + i].isHasShip()) {
                    return false;
                }
            }
        }

        return true;
    }

    //Getters and Setters
    public Square getSquare(int row, int column) {
        return grid[row][column];
    }

    public int getNumRows() {
        return numRows;
    }

    public int getNumColumns() {
        return numColumns;
    }
    public void setNumRows(int numRows) {
        this.numRows = numRows;
    }

    public void setNumColumns(int numColumns) {
        this.numColumns = numColumns;
    }
}
