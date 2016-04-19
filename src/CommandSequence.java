import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class CommandSequence implements Iterable<Command> {
    private ArrayList<Command> commands;

    public CommandSequence(ArrayList<Command> commands) {
        this.commands = commands;
    }

    public static CommandSequence create(String commandsSequence) {
        ArrayList<Command> commands = new ArrayList<Command>();

        for (int i = 0; i < commandsSequence.length(); ++i) {
            commands.add(Command.create(commandsSequence.substring(i, i + 1)));
        }

        return new CommandSequence(commands);
    }

    @Override
    public Iterator<Command> iterator() {
        return this.commands.iterator();
    }

    @Override
    public void forEach(Consumer<? super Command> action) {
        this.commands.forEach(action);
    }

    @Override
    public Spliterator<Command> spliterator() {
        return this.commands.spliterator();
    }
}
