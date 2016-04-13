public class North extends Direction {
    public North() {
        super("N");
    }

    public Direction rotateLeft() {
        return Direction.create("W");
    }

    public Direction rotateRight() {
        return Direction.create("E");
    }
}