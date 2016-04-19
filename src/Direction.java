public abstract class Direction {

    private String representation;

    protected Direction(String representation) {
        this.representation = representation;
    }

    public abstract Direction rotateLeft();

    public abstract Direction rotateRight();

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Direction direction = (Direction) o;

        return representation != null ? representation.equals(direction.representation) : direction.representation == null;

    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (representation != null ? representation.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Direction{" +
                "representation='" + representation + '\'' +
                '}';
    }
}