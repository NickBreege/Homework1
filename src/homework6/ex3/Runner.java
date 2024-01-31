package homework6.ex3;

import java.util.HashMap;

public class Runner {
    public static void main(String[] args) {
        Detail detail1 = new Detail("Пила");
        Detail detail2 = new Detail("Молоток");
        Detail detail3 = new Detail("Отвёртка");
        HashMap<Detail, Integer> map = new HashMap<>();
        map.put(detail1, 1);
        map.put(detail2, 2);
        map.put(detail3, 3);
        System.out.println(map);
    }
}