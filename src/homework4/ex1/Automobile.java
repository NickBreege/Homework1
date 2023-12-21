package homework4.ex1;

public abstract class Automobile {
    private final double length;
    private final double height;
    private final double width;
    private boolean isClean;

    public Automobile(double length, double height, double width, boolean isClean) {
        this.length = length;
        this.height = height;
        this.width = width;
        this.isClean = isClean;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public boolean isClean() {
        return isClean;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }
}
