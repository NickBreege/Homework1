package homework3.ex2;

public class Samsung extends Phone {
    private String model;

    public Samsung(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Samsung " + model + "\n"
                + "Операционная система " + getOs() + "\n"
                + "Плата " + getNameBoard() + "\n"
                + "Размер платы " + getWidth() + "х" + getLength() + "х" + getHeight() + "\n"
                + "Камера " + getManufacturer() + "(" + getZoom() + "x zoom, "
                + (isFlash() ? "есть вспышка)" : "нет вспышки)");
    }
}
