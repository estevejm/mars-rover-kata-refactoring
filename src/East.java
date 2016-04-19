public class East extends Direction {
    public East() {
        super("E");
    }

    public Direction rotateLeft() {
        return Direction.create("N");
    }

    public Direction rotateRight() {
        return Direction.create("S");
    }

    @Override
    public Point moveForward(Point point) {
        return point.moveEast();
    }

    @Override
    public Point moveBackwards(Point point) {
        return point.moveWest();
    }
}