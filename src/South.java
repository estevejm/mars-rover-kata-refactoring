public class South extends Direction {
    public South() {
        super("S");
    }

    public Direction rotateLeft() {
        return Direction.create("E");
    }

    public Direction rotateRight() {
        return Direction.create("W");
    }

    @Override
    public Point moveForward(Point point) {
        return point.moveSouth();
    }

    @Override
    public Point moveBackwards(Point point) {
        return point.moveNorth();
    }
}