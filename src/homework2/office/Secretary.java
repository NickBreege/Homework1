package homework2.office;

public class Secretary {

    public void speak(Boss boss, Manager manager, Security security) {
        System.out.println(boss.nameBoss + " не волнуйтесь, " + manager.nameManager
                + " всё успеет. " + security.nameSecurity + " - подождите!");
    }
}
