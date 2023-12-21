package homework4.ex1;

public class CarWash {
    private int t1 = 4000;
    private int t2 = 2000;

    public int wash(Automobile automobile) {
        if (!automobile.isClean() && isTruck(automobile)) {
            automobile.setClean(true);
            return t1;
        }
        automobile.setClean(true);
        return t2;
    }

    public int wash(Automobile[] automobiles) {
        int sum = 0;
        for (Automobile automobile : automobiles) {
            if (!automobile.isClean() && isTruck(automobile)) {
                automobile.setClean(true);
                sum += t1;
            } else {
                automobile.setClean(true);
                sum += t2;
            }
        }
        return sum;
    }

    private boolean isTruck(Automobile automobile) {
        return automobile.getLength() > 6 || automobile.getHeight() > 2.5 || automobile.getWidth() > 2;
    }
}
