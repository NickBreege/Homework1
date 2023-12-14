package homework3.ex1;

//абстрактный класс Хвойные деревья
public abstract class Conifers extends Tree {
    protected String typeNeedle;

    protected Conifers(int age, String typeNeedle) {
        super(age);
        this.typeNeedle = typeNeedle;
    }
}
