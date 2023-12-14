package homework3;

import homework3.ex1.Birch;
import homework3.ex1.Pine;
import homework3.ex1.Spruce;
import homework3.ex1.Tree;
import homework3.ex2.Apple;
import homework3.ex2.Factory;
import homework3.ex2.Samsung;
import homework3.ex3.Pyramid1;
import homework3.ex5.City;
import homework3.ex5.House;

public class Homework3 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
    }

    public static void ex1() {
        Pine pine = new Pine(100, "Крупный");
        Spruce spruce = new Spruce(50, "Мелкий");
        Birch birch = new Birch(70, false, false, false);
        Tree[] arrayTree = {pine, spruce, birch};
        int sumAge = 0;
        for (Tree age : arrayTree) {
            sumAge += age.getAge();
        }
        double averageAge = (double) sumAge / arrayTree.length;
        System.out.println(averageAge);
    }

    public static void ex2() {
        Samsung samsung = new Samsung("Galaxy");
        Apple apple = new Apple("Iphone 15");
        Factory factory = new Factory();
        factory.assembly(samsung);
        factory.assembly(apple);
        System.out.println(apple);
        System.out.println();
        System.out.println(samsung);
    }

    public static void ex3() {
        Pyramid1 pyramid1 = new Pyramid1();
        pyramid1.print();
    }

    public static void ex4() {
        //Задача со звездочкой!: Лотерейный билет.
        //Создать класс лотерейный билет (у объекта не может быть атрибутов).
        //Создать метод проверить удачу (не принимает в себя аргументов!):
        //каждый десятый билет дает 100 руб,
        //каждый сотый - 5_000,
        //иначе 0
        //Если совпало что билет одновременно десятый и сотый выбор в пользу сотого.
        //
        //Создать здесь 100 билетов, и проверить по каждому удачу.
        //Итоговая сумма выигрыша после проверки удачи 110 билетов должна составить 6_000.
    }

    public static void ex5() {
        //Иммутабельность - невозможность поменять свойства объекта и всех его вложенных объектов.
        //Создать класс House (наименование улицы, номер дома) - создать сеттеры! И геттеры на него.
        //Переопределить вывод в текст - вывод улицы и номера дома.

        //Создать иммутабельный класс City (наименование города, и массив домов).
        //Переопределить вывод в текст - чтобы выводило имя города, и все дома.

        //Создать два дома, создать город с массивом созданных домов
        //При получении домов из массива, и изменении данных (например замена улицы) у дома,
        //у домов внутри city ничего не поменяется.
        //Т.е. при вызове toString, будут старые имена улицы
        House house = new House("Панькова", 28);
        House house1 = new House("Энгельса", 12);
        House[] houses = {house, house1};
        City mgn = new City("Магнитогорск", houses);

        System.out.println(mgn);
        System.out.println();
        mgn.getArrayHouse()[0].setStreet("Бахметьева");
        mgn.getArrayHouse()[0].setNumberHouse(100);
        System.out.println(mgn);

    }
}
