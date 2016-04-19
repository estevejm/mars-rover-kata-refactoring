public abstract class Command {

    public abstract Vector executeCommand(Vector vector);

    public static Command create(String value) {
        if (value.equals("r")) {
            return new RotateRight();
        } else if (value.equals("l")) {
            return new RotateLeft();
        } else if (value.equals("f")) {
            return new MoveForward();
        } else if (value.equals("b")) {
            return new MoveBackwards();
        }

        return new NullCommand();
    }
}