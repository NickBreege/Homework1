package homework7.ex5;

@FunctionalInterface
public interface Ruler<T> {
    int measure(T t);
}