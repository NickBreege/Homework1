package homework2.shop;

public class Runner {
    public static void main(String[] args) {
        Item hummer = new Item("молот", 1000);
        Item screwdriver = new Item("отвертка", 50);
        Item note = new Item("тетрадь", 30);
        Item pen = new Item("ручка", 10);
        Item[] vasiliyItems = {hummer, screwdriver};
        Item[] maryanaItems = {note, pen};
        Worker vasiliy = new Worker("Василий", 35, 'М', vasiliyItems);
        Worker maryana = new Worker("Марьяна", 25, 'Ж', maryanaItems);
        Worker[] workersShop = {vasiliy, maryana};
        Shop shop = new Shop(workersShop);

        shop.info();
        vasiliy.brag();
        maryana.brag();
    }
}
