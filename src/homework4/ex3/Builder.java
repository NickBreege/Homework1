package homework4.ex3;

public class Builder extends Human {
    @Override
    public String sound() {
        return "Я строитель. " + super.sound();
//        System.out.print("Я строитель. ");
//        return super.sound();
    }
}
