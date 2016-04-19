/**
 * Created by ejulimelis on 19/04/16.
 */
public class MoveForward extends Command {
    protected MoveForward() {
        super("f");
    }

    @Override
    public Vector executeCommand(Vector vector) {
        return vector.moveForward();
    }
}
