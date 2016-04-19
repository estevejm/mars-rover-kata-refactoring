public class Vector {

    private Direction direction;
    private Point point;

    public Vector(Point point, Direction direction) {
        this.point = point;
        this.direction = direction;
    }

    public void moveBackwards() {
        if (direction.equals(Direction.create("N"))) {
            point.setY(point.getY() - 1);
        } else if (direction.equals(Direction.create("S"))) {
            point.setY(point.getY() + 1);
        } else if (direction.equals(Direction.create("W"))) {
            point.setX(point.getX() + 1);
        } else {
            point.setX(point.getX() - 1);
        }
    }

    public void moveForward() {
        if (direction.equals(Direction.create("N"))) {
            point.setY(point.getY() + 1);
        } else if (direction.equals(Direction.create("S"))) {
            point.setY(point.getY() - 1);
        } else if (direction.equals(Direction.create("W"))) {
            point.setX(point.getX() - 1);
        } else {
            point.setX(point.getX() + 1);
        }
    }

    public void rotateLeft() {
        this.direction = this.direction.rotateLeft();
    }

    public void rotateRight() {
        this.direction = this.direction.rotateRight();
    }

    public Point getPoint() {
        return point;
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
