public class RotateRight extends Command {

    protected RotateRight() {
        super("r");
    }

    @Override
    public Vector executeCommand(Vector vector) {
        vector.rotateRight();

        return vector;
    }
}
