public class Rover {

    private Vector vector;

    public Rover(int x, int y, String direction) {
        this.vector = new Vector(new Point(x,y), Direction.create(direction));
    }

    public void receive(String commandsSequence) {
        for (int i = 0; i < commandsSequence.length(); ++i) {
            Command command = parseCommand(commandsSequence, i);
            interpretAndExecuteCommand(command);
        }
    }

    private Command parseCommand(String commandsSequence, int i) {
        return new Command(commandsSequence.substring(i, i + 1));
    }

    private void interpretAndExecuteCommand(Command command) {
        if (command.getValue().equals("r")) {
            rotateRight();
        } else if (command.getValue().equals("l")) {
            rotateLeft();
        } else if (command.getValue().equals("f")) {
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
                "vector=" + vector +
                '}';
    }
}
