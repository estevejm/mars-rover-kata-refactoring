public class Command {
    private final String value;

    protected Command(String value) {
        this.value = value;
    }

    public Vector executeCommand(Vector vector) {
        if (this.equals(Command.create("r"))) {
            throw new RuntimeException("Not supposed to be here");
        } else if (this.equals(Command.create("l"))) {
            return vector.rotateLeft();
        } else if (this.equals(Command.create("f"))) {
            return vector.moveForward();
        } else {
            return vector.moveBackwards();
        }
    }

    public static Command create(String value) {
        if (value.equals("r")) {
            return new RotateRight();
        }

        return new Command(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Command command = (Command) o;

        return value != null ? value.equals(command.value) : command.value == null;

    }

    @Override
    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Command{" +
                "value='" + value + '\'' +
                '}';
    }
}