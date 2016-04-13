public class Direction {

    private String direction;

    protected Direction(String direction) {
        this.direction = direction;
    }

    public Direction rotateLeft() {
        throw new IllegalStateException();
    }

    public Direction rotateRight() {
        throw new IllegalStateException();
    }

    public String getDirection() {
        return direction;
    }

    public static Direction create(String direction) {
        if (direction.equals("N")) {
            return new North();
        } else if (direction.equals("S")) {
            return new South();
        } else if (direction.equals("E")) {
            return new East();
        }

        return new West();
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