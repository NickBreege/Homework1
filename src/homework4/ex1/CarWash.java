package homework4.ex1;

public class CarWash {
    private int tariffBigCar = 4000;
    private int tariffSmallCar = 2000;

    public int wash(Automobile automobile) {
        if (!automobile.isClean() && isTruck(automobile)) {
            automobile.setClean(true);
            return tariffBigCar;
        }
        automobile.setClean(true);
        return tariffSmallCar;
    }

    public int wash(Automobile[] automobiles) {
        int sum = 0;
        for (Automobile automobile : automobiles) {
            if (!automobile.isClean() && isTruck(automobile)) {
                automobile.setClean(true);
                sum += tariffBigCar;
            } else {
                automobile.setClean(true);
                sum += tariffSmallCar;
            }
        }
        return sum;
    }

    private boolean isTruck(Automobile automobile) {
        return automobile.getLength() > 6 || automobile.getHeight() > 2.5 || automobile.getWidth() > 2;
    }
}