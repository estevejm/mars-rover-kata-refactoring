public class RotateRight extends Command {

    protected RotateRight() {
        super("r");
    }

    public Vector executeCommand(Vector vector) {
        return vector.rotateRight();
    }
}
