package homework5.ex1;

public class Runner {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Dog dog = new Dog();
        Bird bird = new Bird();
        Zoo<Tiger, Dog, Bird> zoo = new Zoo<>(tiger, dog, bird);

        zoo.getBird().fly();
        zoo.getDog().bark();
        zoo.getTiger().growl();
    }
}