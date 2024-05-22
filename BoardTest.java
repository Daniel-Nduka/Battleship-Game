import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BoardTest {
	
	Board board;
	
		
	@Test
	 public void testBoardInitialization() {
	        Board board = new Board(10, 10);
	        assertNotNull(board);
	        assertEquals(10, board.getNumRows());
	        assertEquals(10, board.getNumColumns());
	    }
	
	@Test
	 public void testBoardGeneration() {
	        Board board = new Board(10, 10);
	        board.generateBattleships();

	        // Test if battleships are generated and placed correctly
	        // You may need to adjust these tests based on your actual implementation
	        assertNotNull(board.getSquare(0, 0));
	        assertNotNull(board.getSquare(0, 1));
	        assertNotNull(board.getSquare(1, 9));
	        // Add more specific tests based on your implementation
	        
	        
	    }
	
	private boolean searchForBattleships() {
	    board = new Board(10,10);
	    board.generateBattleships();
	    // Loop through each square on the board
	    for (int row = 0; row < board.getNumRows(); row++) {
	        for (int column = 0; column < board.getNumColumns(); column++) {
	            if (board.getSquare(row, column).getBattleship() != null) {
	                // If a battleship is found, return true
	                return true;
	            }
	        }
	    }
	    // If no battleship is found, return false
	    return false;
	}
	public boolean searchForSmallBattleships() {
	    board = new Board(10,10);
	    board.generateBattleships();
	    // Loop through each square on the board
	    for (int row = 0; row < board.getNumRows(); row++) {
	        for (int column = 0; column < board.getNumColumns(); column++) {
	            // Check if the square contains a medium battleship
	            if (board.getSquare(row, column).getBattleship() instanceof SmallBattleship) {
	                return true;
	            }
	        }
	    }
	    // If no medium battleship is found, return false
	    return false;
	}
	public boolean searchForMediumBattleships() {
	    board = new Board(10,10);
	    board.generateBattleships();
	    // Loop through each square on the board
	    for (int row = 0; row < board.getNumRows(); row++) {
	        for (int column = 0; column < board.getNumColumns(); column++) {
	            // Check if the square contains a medium battleship
	            if (board.getSquare(row, column).getBattleship() instanceof MediumBattleship) {
	                return true;
	            }
	        }
	    }
	    // If no medium battleship is found, return false
	    return false;
	}
	
	public boolean searchForLargeBattleships() {
	    board = new Board(10,10);
	    board.generateBattleships();
	    // Loop through each square on the board
	    for (int row = 0; row < board.getNumRows(); row++) {
	        for (int column = 0; column < board.getNumColumns(); column++) {
	            // Check if the square contains a medium battleship
	            if (board.getSquare(row, column).getBattleship() instanceof LargeBattleship) {
	                return true;
	            }
	        }
	    }
	    // If no medium battleship is found, return false
	    return false;
	}
	
	@Test
    public void testBattleshipGeneration() {
        Board board = new Board(10, 10);
        board.generateBattleships();

        // Check if battleships were generated
        assertTrue(searchForBattleships());
        assertTrue(searchForSmallBattleships());
        assertTrue(searchForMediumBattleships());
        assertTrue(searchForLargeBattleships());
    }

}
