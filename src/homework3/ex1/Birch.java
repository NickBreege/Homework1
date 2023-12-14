package homework3.ex1;

public class Birch extends Deciduous {
    public Birch(int age, boolean haveLeavesNow, boolean areLeavesFall, boolean areLeavesBloom) {
        super(age, haveLeavesNow, areLeavesFall, areLeavesBloom);
    }

    public void bloom() {
        if (!haveLeavesNow) {
            haveLeavesNow = true;
            if (!areLeavesBloom) {
                areLeavesBloom = true;
            }
        }
        System.out.println("Берёза цветет и появляются листья.\nБерёза источает аллергены.");
    }
}
