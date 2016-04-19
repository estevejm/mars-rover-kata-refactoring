import java.util.ArrayList;

public class CommandSequence {
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
}
