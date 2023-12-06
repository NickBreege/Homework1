package homework2.office;

public class Boss {
    String nameBoss;

    public Boss(String nameBoss) {
        this.nameBoss = nameBoss;
    }

    public void hurry(Manager manager) {
        System.out.println(manager.nameManager + " быстрее!");
    }
}
