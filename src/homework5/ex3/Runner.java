package homework5.ex3;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Item item1 = new Item("Ножницы");
        Item item2 = new Item("Телефон");
        Item item3 = new Item("Ручка");
        Item item4 = new Item("Сок");
        Item item5 = new Item("Носки");
        Item item6 = new Item("Мяч");
        Item item7 = new Item("Кружка");
        ArrayList<Item> items = new ArrayList<>(List.of(item1, item2, item3, item4, item5, item6, item7));
        Storage storage = new Storage();
        storage.addItems(items);
        System.out.println("Все вещи: " + storage.getItems());
        //получаем чётные(по индексу) вещи
        List<Item> allEven = storage.getAllEven();
        System.out.println("Чётные вещи: " + allEven);
        //получаю вещь по индексу([2] - ручка) - вещь должна пропасть из склада
        Item item = storage.getByIndex(2);
        System.out.println(item);
        //проверяю
        System.out.println("Все вещи: " + storage.getItems());
        //удаляю все вещи, кроме последней
        storage.removeExceptLast();
        //проверяю
        System.out.println("Все вещи: " + storage.getItems());
    }
}