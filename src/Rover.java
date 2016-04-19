public class Rover {

    private Direction direction;
    private int y;
    private int x;
    private Point typedPoint;

    public Rover(int x, int y, String direction) {
        setDirection(Direction.create(direction));
        this.typedPoint = new Point(x,y);
        this.setY(y);
        this.setX(x);
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
            setY(getY() + displacement);
        } else if (getDirection().equals("S")) {
            setY(getY() - displacement);
        } else if (getDirection().equals("W")) {
            setX(getX() - displacement);
        } else {
            setX(getX() + displacement);
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

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
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

        if (getDirection() == null) {
            if (other.getDirection() != null)
                return false;
        } else if (!getDirection().equals(other.getDirection()))
            return false;

        if (getX() != other.getX())
            return false;

        if (getY() != other.getY())
            return false;

        return true;
    }
}
