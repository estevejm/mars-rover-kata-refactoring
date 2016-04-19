public class Rover {

    private Direction direction;
    private Point point;

    public Rover(int x, int y, String direction) {
        this.direction = Direction.create(direction);
        this.point = new Point(x,y);
    }

    public void receive(String commandsSequence) {
        for (int i = 0; i < commandsSequence.length(); ++i) {
            String command = commandsSequence.substring(i, i + 1);

            interpretAndExecuteCommand(command);
        }
    }

    private void interpretAndExecuteCommand(String command) {
        if (command.equals("r")) {
            rotateRight();
        } else if (command.equals("l")) {
            rotateLeft();
        } else if (command.equals("f")) {
            moveForward();
        } else {
            moveBackwards();
        }
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rover rover = (Rover) o;

        if (direction != null ? !direction.equals(rover.direction) : rover.direction != null) return false;
        return point != null ? point.equals(rover.point) : rover.point == null;

    }

    @Override
    public int hashCode() {
        int result = direction != null ? direction.hashCode() : 0;
        result = 31 * result + (point != null ? point.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Rover{" +
                "direction=" + direction +
                ", point=" + point +
                '}';
    }
}
