package homework3.ex2;

public class Factory {
    public void assembly(Samsung samsung) {
        samsung.setOs("Android");
        samsung.setNameBoard("j-108");
        samsung.setWidth(10);
        samsung.setLength(12);
        samsung.setHeight(13);
        samsung.setManufacturer("Samsung");
        samsung.setZoom(20);
        samsung.setFlash(false);
    }

    public void assembly(Apple apple) {
        apple.setOs("Ios");
        apple.setNameBoard("7uik");
        apple.setWidth(15);
        apple.setLength(12);
        apple.setHeight(13);
        apple.setManufacturer("iphone");
        apple.setZoom(15);
        apple.setFlash(true);
    }
}
