package Command;

import Rover.Direction;

import static Rover.Direction.*;
import static Rover.Direction.N;

public class CommandLeft implements CommandTurn {
    @Override
    public Direction changeDirection(Direction dir) {
        switch (dir) {
            case N:
                return W;

            case E:
                return N;

            case S:
                return E;

            default:
                return S;


        }
    }
}
