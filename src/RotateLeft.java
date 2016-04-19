/**
 * Created by ejulimelis on 19/04/16.
 */
public class RotateLeft extends Command {
    protected RotateLeft() {
        super("l");
    }

    @Override
    public Vector executeCommand(Vector vector) {
        return vector.rotateLeft();
    }
}
