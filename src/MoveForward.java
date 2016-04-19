/**
 * Created by ejulimelis on 19/04/16.
 */
public class MoveForward extends Command {
    protected MoveForward() {
        super("f");
    }

    public Vector executeCommand(Vector vector) {
        return vector.moveForward();
    }
}
