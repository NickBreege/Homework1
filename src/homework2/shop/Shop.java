package homework2.shop;

import java.util.Arrays;

public class Shop {
    Worker[] workersShop;

    public Shop(Worker[] workersShop) {
        this.workersShop = workersShop;
    }

    public void info() {
        for (Worker infoWorker : this.workersShop) {
            System.out.println(infoWorker.nameWorker + ": " + infoWorker.ageWorker + " лет, пол: "
                    + infoWorker.gender + ", список вещей: " + Arrays.toString(infoWorker.items));
        }
    }
}
