package homework3.ex1;

//абстрактный класс дерево
public abstract class Tree {
    protected int age;

    protected Tree(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
