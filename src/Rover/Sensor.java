package Rover;

public class Sensor {
private Grid grid;
private Position position;
private Direction direction;

    public Sensor(Grid grid, Position position, Direction direction) {
        this.grid = grid;
        this.position = position;
        this.direction = direction;
    }
    public Boolean detectObstacle(Grid grid, Position pos, Direction dir){
    }
}
