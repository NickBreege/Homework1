package homework6.ex1;

import java.util.List;
import java.util.Queue;

public class LuggageSpace {
    private Queue<Suitcase> suitcases;
//    private final List<Worker>;

    public LuggageSpace(Queue<Suitcase> suitcases, Worker[] workers) {
        this.suitcases = suitcases;
//        this.workers = workers;
    }

    public void planeArrival(FlightNumbers flightNumber) {
        for (int i = 0; i < 20; i++) {
            suitcases.add(new Suitcase(flightNumber));
        }
    }

    //КАК СДЕЛАТЬ ТАК, ЧТОБЫ ПО ОЧЕРЕДИ РАБОТНИКИ ШЛИ????
    //3 работника по очереди разгружают вещи, в том порядке, в котором происходили прилеты.
    public void unload() {
        while (!suitcases.isEmpty()) {

        }
    }

    public Queue<Suitcase> getSuitcases() {
        return suitcases;
    }

    public void setSuitcases(Queue<Suitcase> suitcases) {
        this.suitcases = suitcases;
    }

//    public Worker[] getWorkers() {
//        return workers;
//    }

//    public void setWorkers(Worker[] workers) {
//        this.workers = workers;
//    }
}
