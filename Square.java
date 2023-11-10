
public class Square{
	//ATTRIBUTES
	private int row;               //Row index of the Square
	private int column;            //Column index of the Square           
	private boolean hasShip;       //Indicate if there is battleship on the Square
	private Battleship battleship;  //Reference to the battleship on the square if any
	private boolean shotFired;      //Indicates if a Square has been shot
	
	//constructor
	public Square(int row, int column) {
        this.row = row; //Row index of the Square
        this.column = column; //column index of the Square
        this.hasShip = false; //Indicate if there 
        this.shotFired = false;
    }
	
	 // Determine the representation of a square
    public String toString() {
        if (shotFired) {
            if (hasShip) {
                return "x"; // Shot fired and hit a battleship
            } 
            else {
                return "o"; // Shot fired and missed
            }
        } else {
            if (hasShip) {
                return "S"; // Battleship is present but not yet shot. This is for testing purposes
            } 
            else {
                return "-"; // Empty square
            }
        }
    }
    //a method to keep track of shots
    public void shoot() {
        this.shotFired = true;
    }
    
    //Getters and setters
	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}

	public boolean isHasShip() {
		return hasShip;
	}

	public Battleship getBattleship() {
		return battleship;
	}

	public boolean isShotFired() {
		return shotFired;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public void setHasShip(boolean hasShip) {
		this.hasShip = hasShip;
	}

	public void setBattleship(Battleship battleship) {
		this.battleship = battleship;
		this.hasShip = true; //If there is a battleship on the square, set hasShip to true
	}

	public void setShotFired(boolean shotFired) {
		this.shotFired = shotFired;
	}


	
	

}