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

    public Point moveForward(Point point) {
        return point.moveEast();
    }

    public Point moveBackwards(Point point) {
        return point.moveWest();
    }
}