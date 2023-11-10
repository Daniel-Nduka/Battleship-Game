
public class Battleship {
    private boolean shipSunk; //An attribute to check if the ship has been sunk
    private int size; //Size of the battleship in number of squares
    private int health; //Health of the  battleship in number of Squares
    

    public Battleship(int size) {
        this.shipSunk = false;
        this.size = size;
        this.health = size;
      
    }

    public void hit() {
        if (!shipSunk && health > 0) {
            health--;
            if (health == 0) {
                shipSunk = true;
            }
        }
    }
    

    public boolean isShipSunk() {
        return shipSunk;
    }

    public int getHealth() {
        return health;
    }

    public int getSize() {
        return size;
    }



    public void setHealth(int health) {
        this.health = health;
    }

    public void setSize(int size) {
        this.size = size;
    }

 
}
