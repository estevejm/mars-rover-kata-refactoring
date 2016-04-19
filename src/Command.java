/**
 * Created by ejulimelis on 19/04/16.
 */
public class Command {
    private final String value;

    private Command(String value) {
        this.value = value;
    }

    public Vector executeCommand(Vector vector) {
        if (this.equals(Command.create("r"))) {
            vector.rotateRight();
        } else if (this.equals(Command.create("l"))) {
            vector.rotateLeft();
        } else if (this.equals(Command.create("f"))) {
            vector.moveForward();
        } else {
            vector.moveBackwards();
        }

        return vector;
    }

    public static Command create(String value) {
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