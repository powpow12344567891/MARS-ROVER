package Rover;

import java.util.ArrayList;

public class Grid {
private int x;
private  int y;
private ArrayList<Position> obstacles;

    public Grid(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public Grid(int x, int y, ArrayList<Position> obstacles) {
        this.x = x;
        this.y = y;
        this.obstacles = obstacles;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public void setObstacles(ArrayList<Position> obstacles) {
        this.obstacles = obstacles;
    }

}
