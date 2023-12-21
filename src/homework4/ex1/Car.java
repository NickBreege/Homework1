package homework4.ex1;

public class Car extends Automobile {
    private boolean haveCruise;

    public Car(double length, double height, double width, boolean isClean, boolean haveCruise) {
        super(length, height, width, isClean);
        this.haveCruise = haveCruise;
    }

    public boolean isHaveCruise() {
        return haveCruise;
    }
}
