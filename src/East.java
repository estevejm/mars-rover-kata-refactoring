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
}