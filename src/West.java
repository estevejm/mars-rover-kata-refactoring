public class West extends Direction {
    public West() {
        super("W");
    }

    public Direction rotateLeft() {
        return Direction.create("S");
    }

    public Direction rotateRight() {
        return Direction.create("N");
    }
}