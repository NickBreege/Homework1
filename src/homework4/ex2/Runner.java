package homework4.ex2;

public class Runner {
    public static void main(String[] args) {
        Duck duck1 = new Duck(false);
        Duck duck2 = new Duck(true);
        Airplane airplane1 = new Airplane(10);
        Airplane airplane2 = new Airplane(-1);

        Flyable[] flyables = {duck1, duck2, airplane1, airplane2};

        for (Flyable flyable : flyables) {
            try {
                flyable.fly();
            } catch (FlyException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
