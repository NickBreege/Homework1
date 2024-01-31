package homework6.ex2;

import java.util.HashMap;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        homework6.ex2.Item apple = new homework6.ex2.Item("Яблоко");
        homework6.ex2.Item banana = new homework6.ex2.Item("Банан");
        homework6.ex2.Item orange = new homework6.ex2.Item("Апельсин");
        Map<Item, Integer> map = new HashMap<>();
        map.put(apple, 1);
        map.put(banana, 2);
        map.put(orange, 3);
        System.out.println(map.get(orange));
        /*
        int a = apple.hashCode();
        int indexBucketApple = (a % (16 - 1) + 1);
        System.out.println("Номер бакета для яблока " + indexBucketApple);
        System.out.println("_________________________");

        int b = banana.hashCode();
        int indexBucketBanana = (b % (16 - 1) + 1);
        System.out.println("Номер бакета для банана " + indexBucketBanana);
        System.out.println("_________________________");

        int o = orange.hashCode();
        int indexBucketOrange = (o % (16 - 1) + 1);
        System.out.println("Номер бакета для апельсина " + indexBucketOrange);
         */
    }
}