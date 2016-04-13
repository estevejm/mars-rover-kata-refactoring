public class Direction {

    private String direction;

    public Direction(String direction) {
        setDirection(direction);
    }

    public void rotateLeft() {
        if (getDirection().equals("N")) {
            setDirection("W");
        } else if (getDirection().equals("S")) {
            setDirection("E");
        } else if (getDirection().equals("W")) {
            setDirection("S");
        } else {
            setDirection("N");
        }
    }

    public void rotateRight() {
        if (getDirection().equals("N")) {
            setDirection("E");
        } else if (getDirection().equals("S")) {
            setDirection("W");
        } else if (getDirection().equals("W")) {
            setDirection("N");
        } else {
            setDirection("S");
        }
    }

    public String getDirection() {
        return direction;
    }

    private void setDirection(String direction) {
        this.direction = direction;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        Direction direction1 = (Direction) object;

        if (direction != null ? !direction.equals(direction1.direction) : direction1.direction != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (direction != null ? direction.hashCode() : 0);
        return result;
    }
}