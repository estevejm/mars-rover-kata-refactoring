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
}