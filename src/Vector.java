public class Vector {

    private Direction direction;
    private Point point;

    public Vector(Point point, Direction direction) {
        this.point = point;
        this.direction = direction;
    }

    public Vector moveBackwards() {
        Point newPoint = direction.moveBackwards(point);

        return new Vector(newPoint, direction);
    }

    public Vector moveForward() {
        Point newPoint = direction.moveForward(this.point);

        return new Vector(newPoint, direction);
    }

    public Vector rotateLeft() {
        Direction newDirection = this.direction.rotateLeft();

        return new Vector(point, newDirection);
    }

    public Vector rotateRight() {
        Direction newDirection = this.direction.rotateRight();

        return new Vector(point, newDirection);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vector vector = (Vector) o;

        if (direction != null ? !direction.equals(vector.direction) : vector.direction != null) return false;
        return point != null ? point.equals(vector.point) : vector.point == null;

    }

    @Override
    public int hashCode() {
        int result = direction != null ? direction.hashCode() : 0;
        result = 31 * result + (point != null ? point.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "direction=" + direction +
                ", point=" + point +
                '}';
    }
}
