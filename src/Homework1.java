public class Homework1 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
    }

    public static void ex1() {
        String name = "     ПЕтРов Олег Иванович     ";
        if (name.contains("ова ")) {
            System.out.println("Уважаемая " + name.trim().toUpperCase());
        } else if (name.contains("ов ")) {
            System.out.println("Уважаемый " + name.trim().toUpperCase());
        } else {
            System.out.println("Неизвестное лицо " + name.trim().toUpperCase());
        }
    }

    public static void ex2() {
        double fuel = 10;
        boolean isEngineWork = true;
        boolean hasErrors = false;
        boolean isWheelWork1 = true;
        boolean isWheelWork2 = true;
        boolean isWheelWork3 = true;
        boolean isWheelWork4 = true;

        if (
                fuel >= 10
                        && (isWheelWork1 && isWheelWork2 && isWheelWork3 && isWheelWork4)
                        && (!hasErrors)
                        && isEngineWork
        ) {
            System.out.println("Машина работает");
        } else {
            System.out.println("Машина не работает");
        }
    }

    public static void ex3() {
        String simply = "this is simply. This is my favorite song.";
        String replace = simply.replace("this is", "those are").
                replace("This is", "Those are");
        System.out.println(replace.indexOf("o", 3));
    }

    public static void ex4() {
        int sausagePrice = 800;
        int sausagePriceLess1000 = 412;
        int sausagePriceLess2000 = 408;
        int sausagePriceMore2000 = 404;

        int hamPrice = 350;
        int costPriceHam = 275;

        int neckPrice = 500;
        int neckPriceLess500 = 311;
        int neckPriceMore500 = 299;

        long profitSausage = sausagePrice * 2000;                                          //доход колбасы 1_600_000
        long profitHam = hamPrice * 8511;                                                  //доход ветчины 2_978_850
        long profitNeck = neckPrice * 6988;                                                //доход шейки   3_494_000
        long totalProfit = profitSausage + profitHam + profitNeck;                         //ОБЩИЙ ДОХОД:  8_072_850

        long expenseSausage = sausagePriceMore2000 * 2000;                                 //расход колбасы 808_000
        long expenseHam = costPriceHam * 8511;                                             //расход ветчины 2_340_525
        long expenseNeck = neckPriceMore500 * 6988;                                        //расход шейки   2_089_412
        long totalExpense = expenseSausage + expenseHam + expenseNeck + 1_000_000;         //ОБЩИЙ РАСХОД:  6_237_937

        long profitBeforeTax = totalProfit - totalExpense;                    //общая прибыль до налогов    1_834_913
        long profitAfterTax = 0;                       //прибыль(часть прибыли), которая ещё не прошла через налоговую
        //ВОТ ТУТ НЕ ПОНЯЛ, ПОЧЕМУ tax1 и tax2 МОЖНО НЕ ПРИСВАИВАТЬ 0, а tax3 ОБЯЗАТЕЛЬНО ПРОСИТ ПРИСВОИТЬ НОЛЬ
        double tax1, tax2, tax3 = 0;
        if (profitBeforeTax >= 1_000_000) {
            tax1 = (double) 1_000_000 / 100 * 8;
            profitAfterTax = profitBeforeTax - 1_000_000;
        } else {
            tax1 = (double) profitBeforeTax / 100 * 8;
        }

        if (profitAfterTax > 1_000_000) {
            tax2 = (double) 1_000_000 / 100 * 10;
            profitAfterTax = profitAfterTax - 1_000_000;
        } else {
            tax2 = (double) profitAfterTax / 100 * 10;
            profitAfterTax = 0L;
        }

        if (profitAfterTax > 0) {
            tax3 = (double) profitAfterTax / 100 * 13;
        }

        double allTax = tax1 + tax2 + tax3;
        System.out.println("Прибыль до налогов: " + profitBeforeTax);
        System.out.println("Общая сумма налогов равна: " + allTax);
        System.out.println("Прибыль после налогов " + (profitBeforeTax - allTax));
    }
}
