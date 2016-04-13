public class Direction {

    private String representation;

    protected Direction(String representation) {
        this.representation = representation;
    }

    public Direction rotateLeft() {
        throw new IllegalStateException();
    }

    public Direction rotateRight() {
        throw new IllegalStateException();
    }

    public String getRepresentation() {
        return representation;
    }

    public static Direction create(String representation) {
        if (representation.equals("N")) {
            return new North();
        } else if (representation.equals("S")) {
            return new South();
        } else if (representation.equals("E")) {
            return new East();
        }

        return new West();
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        Direction direction1 = (Direction) object;

        if (representation != null ? !representation.equals(direction1.representation) : direction1.representation != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (representation != null ? representation.hashCode() : 0);
        return result;
    }
}