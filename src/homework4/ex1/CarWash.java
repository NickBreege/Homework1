package homework4.ex1;

public class CarWash {
    private static final int TARIFF_BIG_CAR = 4000;
    private static final int TARIFF_SMALL_CAR = 2000;

    public int wash(Automobile automobile) {
        if (!automobile.isClean() && isTruck(automobile)) {
            automobile.setClean(true);
            return TARIFF_BIG_CAR;
        }
        automobile.setClean(true);
        return TARIFF_SMALL_CAR;
    }

    public int wash(Automobile[] automobiles) {
        int sum = 0;
        for (Automobile automobile : automobiles) {
            if (!automobile.isClean() && isTruck(automobile)) {
                automobile.setClean(true);
                sum += TARIFF_BIG_CAR;
            } else {
                automobile.setClean(true);
                sum += TARIFF_SMALL_CAR;
            }
        }
        return sum;
    }

    private boolean isTruck(Automobile automobile) {
        return automobile.getLength() > 6 || automobile.getHeight() > 2.5 || automobile.getWidth() > 2;
    }
}