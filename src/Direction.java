public class Direction {

    private String direction;

    private Direction(String direction) {
        this.direction = direction;
    }

    public Direction rotateLeft() {
        if (direction.equals("N")) {
            return Direction.create("W");
        } else if (direction.equals("S")) {
            return Direction.create("E");
        } else if (direction.equals("W")) {
            return Direction.create("S");
        } else {
            return Direction.create("N");
        }
    }

    public Direction rotateRight() {
        if (direction.equals("N")) {
            return Direction.create("E");
        } else if (direction.equals("S")) {
            return Direction.create("W");
        } else if (direction.equals("W")) {
            return Direction.create("N");
        } else {
            return Direction.create("S");
        }
    }

    public String getDirection() {
        return direction;
    }

    public static Direction create(String direction) {
        return new Direction(direction);
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        Direction direction1 = (Direction) object;

        if (direction != null ? !direction.equals(direction1.direction) : direction1.direction != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (direction != null ? direction.hashCode() : 0);
        return result;
    }
}