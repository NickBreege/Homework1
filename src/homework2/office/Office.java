package homework2.office;

public class Office {
    Boss boss;
    Manager manager;
    Secretary secretary;
    Security security;

    public Office(Boss boss, Manager manager, Security security, Secretary secretary) {
        this.boss = boss;
        this.manager = manager;
        this.security = security;
        this.secretary = secretary;
    }

    public void workingDay() {
        boss.hurry(manager);
        manager.scream();
        security.askMoney();
        secretary.speak(boss, manager, security);
    }

}
