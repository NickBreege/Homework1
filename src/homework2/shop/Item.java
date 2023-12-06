package homework2.shop;

public class Item {
    String nameItem;
    double weightItem;

    public Item(String nameItem, double weightItem) {
        this.nameItem = nameItem;
        this.weightItem = weightItem;
    }

    @Override
    public String toString() {
        return nameItem;
    }
}
