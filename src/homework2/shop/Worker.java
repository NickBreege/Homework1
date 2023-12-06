package homework2.shop;

public class Worker {
    String nameWorker;
    int ageWorker;
    char gender;
    Item[] items;

    public Worker(String nameWorker, int ageWorker, char gender, Item[] items) {
        this.nameWorker = nameWorker;
        this.ageWorker = ageWorker;
        this.gender = gender;
        this.items = items;
    }

    public void brag() {
        for (Item item : this.items) {
            System.out.println(this.nameWorker + ": смотрите какая у меня вещь - " + item);
        }
    }
}
