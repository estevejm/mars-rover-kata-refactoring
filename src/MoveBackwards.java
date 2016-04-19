/**
 * Created by ejulimelis on 19/04/16.
 */
public class MoveBackwards extends Command {
    protected MoveBackwards() {
        super("b");
    }

    public Vector executeCommand(Vector vector) {
        return vector.moveBackwards();
    }
}
