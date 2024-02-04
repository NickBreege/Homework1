package homework7.ex2;

@FunctionalInterface
public interface Growable<T extends Fruit> {
    T grow();
}