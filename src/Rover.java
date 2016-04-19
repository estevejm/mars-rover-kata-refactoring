public class Rover {

    private Direction direction;
    private Point typedPoint;

    public Rover(int x, int y, String direction) {
        setDirection(Direction.create(direction));
        this.typedPoint = new Point(x,y);
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
            typedPoint.setY(typedPoint.getY() + displacement);
        } else if (getDirection().equals("S")) {
            typedPoint.setY(typedPoint.getY() - displacement);
        } else if (getDirection().equals("W")) {
            typedPoint.setX(typedPoint.getX() - displacement);
        } else {
            typedPoint.setX(typedPoint.getX() + displacement);
        }
    }

    private void rotateLeft() {
        setDirection(this.direction.rotateLeft());
    }

    private void rotateRight() {
        setDirection(this.direction.rotateRight());
    }

    private String getDirection() {
        return direction.getRepresentation();
    }

    private void setDirection(Direction direction) {
        this.direction = direction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rover rover = (Rover) o;

        if (direction != null ? !direction.equals(rover.direction) : rover.direction != null) return false;
        return typedPoint != null ? typedPoint.equals(rover.typedPoint) : rover.typedPoint == null;

    }

    @Override
    public int hashCode() {
        int result = direction != null ? direction.hashCode() : 0;
        result = 31 * result + (typedPoint != null ? typedPoint.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Rover{" +
                "direction=" + direction +
                ", typedPoint=" + typedPoint +
                '}';
    }
}
