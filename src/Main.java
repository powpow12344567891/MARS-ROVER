import Rover.Grid;
import Rover.Position;
import Rover.Rover;
import Utils.ListeObstacle;

import java.util.ArrayList;
import Rover.Direction;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Grid grid = new Grid(100, 100);
        ListeObstacle listeObstacle = null;
        ArrayList<Position> obstacles = listeObstacle.creerObstacles(grid);
        Rover rover = new Rover(new Position(0,0), Direction.N,grid);

    }
}