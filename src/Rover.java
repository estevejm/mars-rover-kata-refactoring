public class Rover {

    private Direction direction;
    private Point point;
    private Vector vector;

    public Rover(int x, int y, String direction) {
        this.direction = Direction.create(direction);
        this.point = new Point(x,y);
        this.vector = new Vector(this.point, this.direction);
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
        this.vector.moveBackwards();
    }

    private void moveForward() {
        this.vector.moveForward();
    }

    private void rotateLeft() {
        this.vector.rotateLeft();
    }

    private void rotateRight() {
        this.vector.rotateRight();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rover rover = (Rover) o;

        return vector != null ? vector.equals(rover.vector) : rover.vector == null;

    }

    @Override
    public int hashCode() {
        return vector != null ? vector.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Rover{" +
                "direction=" + direction +
                ", point=" + point +
                '}';
    }
}
