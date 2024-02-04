package homework7.ex2;

public class Runner {
    public static void main(String[] args) {
        Growable<Apple> appleFarm = Apple::new;
        Growable<Apricot> apricotFarm = Apricot::new;

        System.out.println(appleFarm.grow());
        System.out.println(apricotFarm.grow());
    }
}