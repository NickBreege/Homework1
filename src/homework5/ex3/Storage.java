package homework5.ex3;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    private List<Item> items = new ArrayList<>();

    public void addItems(List<Item> listItems) {
        items.addAll(listItems);
    }

    public List<Item> getAllEven() {
        ArrayList<Item> evenItems = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            if (i % 2 == 0) {
                evenItems.add(items.get(i));
            }
        }
        return evenItems;
    }

    public Item getByIndex(int index) {
        if (index < 0 || index >= items.size()) {
            throw new RuntimeException("Вы ввели некорректное значение индекса!");
        }
        Item item = items.get(index);
        items.remove(index);
        return item;
    }

    public void removeExceptLast() {
        if (items.size() > 1) {
            //можно написать так:
//            Item lastItem = items.get(items.size() - 1);
//            items.clear();
//            items.add(lastItem);
            //можно так:
            items.subList(0, items.size() - 1).clear();
        }
    }

    public List<Item> getItems() {
        return items;
    }
}