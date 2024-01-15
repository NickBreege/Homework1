package homework5.ex3;

import java.util.ArrayList;

public class Storage {
    private ArrayList<Item> items = new ArrayList<>();

    public void addItems(ArrayList<Item> listItems) {
        items.addAll(listItems);
    }

    public void getAllEven() {
        ArrayList<Item> evenItems = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            if (i % 2 == 0) {
                evenItems.add(items.get(i));
            }
        }
        System.out.println(evenItems);
    }

    public void getByIndex(int index) {
        if (index < 0 || index >= items.size()) {
            throw new RuntimeException("Вы ввели некорректное значение индекса!");
        }
        Item item = items.get(index);
        items.remove(index);
        System.out.println(item);
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

    public ArrayList<Item> getItems() {
        return items;
    }
}