package homework2;

import java.util.Random;

public class Homework2 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
    }

    public static void ex1() {
        int[][] arrayOfNumbers = new int[10][10];
        arrayOfNumbers[0] = new int[]{131, 2, 3, 4, 5, 6, 7, 8, 9, 102};
        arrayOfNumbers[1] = new int[]{1, 20, 3, 4, 5, 6, 7, 8, 93, 10};
        arrayOfNumbers[2] = new int[]{1, 2, 31, 4, 5, 6, 7, 81, 9, 10};
        arrayOfNumbers[3] = new int[]{1, 2, 3, 45, 5, 6, 77, 8, 9, 10};
        arrayOfNumbers[4] = new int[]{1, 2, 3, 4, 57, 67, 7, 8, 9, 10};
        arrayOfNumbers[5] = new int[]{1, 2, 3, 4, 533, 68, 7, 8, 9, 10};
        arrayOfNumbers[6] = new int[]{1, 2, 3, 40, 5, 6, 72, 8, 9, 10};
        arrayOfNumbers[7] = new int[]{1, 2, 30, 4, 5, 6, 7, 83, 9, 10};
        arrayOfNumbers[8] = new int[]{1, 20, 3, 4, 5, 6, 7, 8, 901, 10};
        arrayOfNumbers[9] = new int[]{10, 2, 3, 4, 5, 6, 7, 8, 9, 101};

        //С левого верхнего угла к нижнему правому
        int leftUpToRightDownSum = 0;
        for (int lineAndElement = 0; lineAndElement < arrayOfNumbers.length; lineAndElement++) {
            leftUpToRightDownSum += arrayOfNumbers[lineAndElement][lineAndElement];
        }
        System.out.println(leftUpToRightDownSum);

        //С левого нижнего угла к верхнему правому
        //длина равна 10, начальный элемент под индексом 9, а конечный элемент под индексом 0
        int leftDownToRightUpSum = 0;
        //завожу переменную, чтобы в конкретном массиве начинать не с конца элементов, а с начала
        int len = arrayOfNumbers.length - 1;
        for (int lineAndElement = len; lineAndElement >= 0; lineAndElement--) {
            leftDownToRightUpSum += arrayOfNumbers[lineAndElement][len - lineAndElement];
        }
        System.out.println(leftDownToRightUpSum);
    }

    public static void ex2() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int length = numbers.length;
        //Переменная, которая будет использоваться при обмене элементов
        int temp;
        for (int i = 0; i < length / 2; i++) {
            temp = numbers[length - i - 1];        //temp = numbers[9 - 0 - 1]   (temp = numbers[8])
            numbers[length - i - 1] = numbers[i];   //теперь присваиваем numbers[8] = numbers[0]
            numbers[i] = temp;                      //numbers[0] = temp [8]
        }
        for (int element : numbers) {
            System.out.print(element + " ");
        }
    }

    public static void ex3() {
        Random random = new Random(1);
        int number;
        int count = 0; //переменная счётчик для попыток
        do {
            count++;
            number = random.nextInt(1000);
            System.out.println(number);
        } while (number != 999);
        System.out.println("Попытка номер: " + count);
    }

    public static void ex4() {
        // В пакете Shop
    }

    public static void ex5() {
        // В пакете Office
    }
}
