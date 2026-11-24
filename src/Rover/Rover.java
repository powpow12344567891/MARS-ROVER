package Rover;

public class Rover {
    private Position position;
    private Direction direction;
    private Grid grid;

    public Rover(Position position, Direction direction,Grid grid) {
        this.position = position;
        this.direction = direction;
        this.grid = grid;
    }
    public void followCommand(String listCommand) {
        for (int i = 0; i < listCommand.length(); i++) {
            char c = listCommand.charAt(i);
            switch (c){
                case 'f':
                    break;
                case 'b':
                    break;

                case 'l':
                    break;
                case 'r':
                    break;
                default:
                    System.out.println("pas une commande valide");
            }
        }
    }
    public Position getPosition() {
        return position;
    }

    public Direction getDirection() {
        return direction;
    }
}
