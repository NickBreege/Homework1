package homework7.ex3;

@FunctionalInterface
public interface Divinationable<T> {
    boolean divination(T t);
}