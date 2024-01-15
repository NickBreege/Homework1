package homework5.ex2;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(List.of(5, 2, 4));
        ArrayList<Integer> list2 = new ArrayList<>(List.of(7, 10));
        //создаю третий список на основе первого листа
        ArrayList<Integer> list3 = new ArrayList<>(list1);
        //добавляю в третий лист все элементы из второго листа
        list3.addAll(list2);
        //удаляю третий ЭЛЕМЕНТ, а не элемент под индексом 3
        list3.remove(2);
        //вывожу индекс числа 10
        System.out.println(list3.indexOf(10));
    }
}