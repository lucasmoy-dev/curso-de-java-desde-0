package academy.atl.rover.models;

public enum Direction {
    NORTH(1), EAST(1), SOUTH(-1), WEST(-1);

    private int value;

    Direction(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
