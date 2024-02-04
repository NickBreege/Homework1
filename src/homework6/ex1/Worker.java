package homework6.ex1;

import java.util.Queue;

public class Worker {
    private String name;

    public Worker(String name) {
        this.name = name;
    }

    public void throwLuggage(Queue<Suitcase> suitcases) {
        System.out.println(name + ": Мужики, кидаю чемодан " + suitcases.poll());
    }

    public String getName() {
        return name;
    }
}
