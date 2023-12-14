package homework2.office;

public class Boss {
    String name;

    public Boss(String nameBoss) {
        this.name = nameBoss;
    }

    public void hurry(Manager manager) {
        System.out.println(manager.nameManager + " быстрее!");
    }
}
