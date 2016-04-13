public class Rover {

    private Direction directionType;
    private String direction;
    private int y;
    private int x;

    public Rover(int x, int y, String direction) {
        setDirection(direction);
        this.y = y;
        this.x = x;
    }

    public void receive(String commandsSequence) {
        for (int i = 0; i < commandsSequence.length(); ++i) {
            String command = commandsSequence.substring(i, i + 1);

            interpretAndExecuteCommand(command);
        }
    }

    private void interpretAndExecuteCommand(String command) {
        if (command.equals("r")) {
            rotateRight();
        } else if (command.equals("l")) {
            rotateLeft();
        } else {
            displace(command);
        }
    }

    private void displace(String command) {
        int displacement1 = -1;

        if (command.equals("f")) {
            displacement1 = 1;
        }
        int displacement = displacement1;

        if (getDirection().equals("N")) {
            y += displacement;
        } else if (getDirection().equals("S")) {
            y -= displacement;
        } else if (getDirection().equals("W")) {
            x -= displacement;
        } else {
            x += displacement;
        }
    }

    private void rotateLeft() {
        Direction newDirection = this.directionType.rotateLeft();
        setDirection(newDirection.getDirection());
    }

    private void rotateRight() {
        Direction newDirection = this.directionType.rotateRight();
        setDirection(newDirection.getDirection());
    }

    private String getDirection() {
        return directionType.getDirection();
    }

    private void setDirection(String direction) {
        this.direction = direction;
        this.directionType = Direction.create(direction);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        Rover other = (Rover) obj;

        if (direction == null) {
            if (other.direction != null)
                return false;
        } else if (!direction.equals(other.direction))
            return false;

        if (x != other.x)
            return false;

        if (y != other.y)
            return false;

        return true;
    }
}
