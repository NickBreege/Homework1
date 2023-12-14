package homework3.ex1;

//абстрактный класс лиственные деревья
public abstract class Deciduous extends Tree {
    protected boolean haveLeavesNow;
    protected boolean areLeavesFall;
    protected boolean areLeavesBloom;

    protected Deciduous(int age, boolean haveLeavesNow, boolean areLeavesFall, boolean areLeavesBloom) {
        super(age);
        this.haveLeavesNow = haveLeavesNow;
        this.areLeavesFall = areLeavesFall;
        this.areLeavesBloom = areLeavesBloom;
    }
}
