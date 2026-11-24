package Command;

import Rover.Direction;

import static Rover.Direction.*;

public class CommandRight implements CommandTurn {
    @Override
    public Direction changeDirection(Direction dir) {
        switch (dir) {
            case N:
                return E;

            case E:
                return S;

            case S:
                return W;

            default:
                return N;


        }
    }

}