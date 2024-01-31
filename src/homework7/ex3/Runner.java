package homework7.ex3;

public class Runner {
    public static void main(String[] args) {
        Divinationable<Chamomile> chamomileDivination = chamomile -> {
            return chamomile.getName().length() % 2 == 0;
        };

        Divinationable<Human> humanDivination = human -> {
            return human.getAge() + human.getHeight() > 210;
        };

        boolean result1 = chamomileDivination.divination(new Chamomile("Антон"));
        System.out.println(result1);

        boolean result2 = humanDivination.divination(new Human(55, 156));
        System.out.println(result2);
    }
}