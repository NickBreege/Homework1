package homework3.ex2;

public class Apple extends Phone {
    private String model;

    public Apple(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Apple " + model + "\n"
                + "Операционная система " + getOs() + "\n"
                + "Плата " + getNameBoard() + "\n"
                + "Размер платы " + getWidth() + "х" + getLength() + "х" + getHeight() + "\n"
                + "Камера " + getManufacturer() + "(" + getZoom() + "x zoom, "
                + (isFlash() ? "есть вспышка)" : "нет вспышки)");
    }
}
