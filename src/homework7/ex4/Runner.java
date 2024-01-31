package homework7.ex4;

public class Runner {
    public static void main(String[] args) {
        Burnable<Tree> bonfire = tree -> System.out.println("желто-красный свет вокруг!");
        Burnable<Uranium> atomicReactor = uranium -> System.out.println("зеленый свет вокруг!");

        bonfire.burn(new Tree());
        atomicReactor.burn(new Uranium());
    }
}