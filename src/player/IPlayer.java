package player;

import board.Board;
import ship.Ship;

import java.util.ArrayList;

public abstract class IPlayer {
    protected Board board;

    public String name;
    public ArrayList<Ship> ships = new ArrayList<>();
    public int rank;
    public String symbol;
    public ArrayList<int[]> struck = new ArrayList<>();
    public void handleShot(int[] shot, IPlayer opponent){};
    public boolean isAlive(){return true;}
    public boolean validShot(int[] shot, IPlayer opponent){ return false;} //TODO: FIX!

    public Board getBoard() {
        return board;
    }

    public void addShip(Ship ship) {
        this.ships.add(ship);
    }
}
