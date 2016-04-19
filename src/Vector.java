public class Vector {

    private Direction direction;
    private Point point;

    public Vector(Point point, Direction direction) {
        this.point = point;
        this.direction = direction;
    }

    private void moveBackwards() {
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

    private void moveForward() {
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

    private void rotateLeft() {
        this.direction = this.direction.rotateLeft();
    }

    private void rotateRight() {
        this.direction = this.direction.rotateRight();
    }
}
