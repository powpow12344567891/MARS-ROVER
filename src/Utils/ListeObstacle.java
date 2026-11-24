package Utils;

import Rover.Grid;
import Rover.Position;

import java.util.ArrayList;
import java.util.Scanner;

public class ListeObstacle {
    Scanner scanner = new Scanner(System.in);

    public ArrayList<Position> creerObstacles(Grid grid){
     String input = "";
     int x;
     int y;
     ArrayList<Position> obstacles = new ArrayList<>();
        System.out.println("generer des obstacles");
        input = scanner.nextLine();
        System.out.println("quitter => q");
        while( input != "q"){
            System.out.println("entrez la position x");
            x = scanner.nextInt();
            System.out.println("entrez la position y");
            y = scanner.nextInt();
            if(x >= 0 && x <= grid.getX() && y >= 0 && y <= grid.getY()){
                obstacles.add(new Position(x,y));
            }
            else{
                System.out.println("positions invalides");
            }


        }
        return  obstacles;
    }
}
