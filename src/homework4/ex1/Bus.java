package homework4.ex1;

public class Bus extends Automobile {
    private int countPassengers;

    public Bus(double length, double height, double width, boolean isClean, int countPassengers) {
        super(length, height, width, isClean);
        this.countPassengers = countPassengers;
    }

    public int getCountPassengers() {
        return countPassengers;
    }
}
