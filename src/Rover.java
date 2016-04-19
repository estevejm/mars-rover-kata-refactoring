public class Rover {

    private Vector vector;

    public Rover(int x, int y, String direction) {
        this.vector = new Vector(new Point(x,y), Direction.create(direction));
    }

    public void receive(String commandsSequence) {
        CommandSequence sequence = CommandSequence.create(commandsSequence);

        for (Command command: sequence) {

        }

        for (int i = 0; i < commandsSequence.length(); ++i) {
            Command command = parseCommand(commandsSequence, i);
            executeCommand(command);
        }
    }

    private Command parseCommand(String commandsSequence, int i) {
        return Command.create(commandsSequence.substring(i, i + 1));
    }

    private void executeCommand(Command command) {
        vector = command.executeCommand(vector);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rover rover = (Rover) o;

        return vector != null ? vector.equals(rover.vector) : rover.vector == null;

    }

    @Override
    public int hashCode() {
        return vector != null ? vector.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Rover{" +
                "vector=" + vector +
                '}';
    }
}
