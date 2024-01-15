package homework5.ex1;

//зоопарк хранит в себе три класса, которые наследуются от Animal
public class Zoo<T, D, B extends Animal> {
    private T tiger;
    private D dog;
    private B bird;

    //при создании зоопарка мы явно указываем, что у нас должно быть по одному животному из каждого класса
    public Zoo(T tiger, D dog, B bird) {
        this.tiger = tiger;
        this.dog = dog;
        this.bird = bird;
    }

    public T getTiger() {
        return tiger;
    }

    public D getDog() {
        return dog;
    }

    public B getBird() {
        return bird;
    }
}