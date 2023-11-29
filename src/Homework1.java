public class Homework1 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
    }

    public static void ex1() {
        String name = "     ПЕтРов Олег Иванович     ";
        String upperCase = name.trim().toUpperCase();
        if (upperCase.contains("ОВА ")) {
            System.out.println("Уважаемая " + upperCase);
        } else if (upperCase.contains("ОВ ")) {
            System.out.println("Уважаемый " + upperCase);
        } else {
            System.out.println("Неизвестное лицо " + upperCase);
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

        double profitBeforeTax = totalProfit - totalExpense;                    //общая прибыль до налогов    1_834_913
        double MoneyWithoutTax = 0;                       //прибыль(часть прибыли), которая ещё не прошла через налоговую
        //ВОТ ТУТ НЕ ПОНЯЛ, ПОЧЕМУ tax1 и tax2 МОЖНО НЕ ПРИСВАИВАТЬ 0, а tax3 ОБЯЗАТЕЛЬНО ПРОСИТ ПРИСВОИТЬ НОЛЬ
        //Потому что tax1, tax2 будут заполнены в любом случае, а tax3 - нет (если в третьем блоке if - else
        //будет прописано else {tax3 = "любое число"}, то инициализировать tax3 необязательно)
        double tax1, tax2, tax3 = 0;
        if (profitBeforeTax >= 1_000_000) {
            tax1 = (double) 1_000_000 * 0.08;
            MoneyWithoutTax = profitBeforeTax - 1_000_000;
        } else {
            tax1 = profitBeforeTax * 0.08;
        }

        if (MoneyWithoutTax > 1_000_000) {
            tax2 = (double) 1_000_000 * 0.1;
            MoneyWithoutTax = MoneyWithoutTax - 1_000_000;
        } else {
            tax2 = MoneyWithoutTax * 0.1;
            MoneyWithoutTax = 0L;
        }

        if (MoneyWithoutTax > 0) {
            tax3 = MoneyWithoutTax * 0.13;
        }

        double allTax = tax1 + tax2 + tax3;
        double profitAfterTax = profitBeforeTax - allTax;
        System.out.println("Прибыль до налогов: " + profitBeforeTax);
        System.out.println("Общая сумма налогов равна: " + allTax);
        System.out.println("Прибыль после налогов " + profitAfterTax);
    }
}
