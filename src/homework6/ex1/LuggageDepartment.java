package homework6.ex1;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LuggageDepartment {
    private Queue<Suitcase> suitcases = new LinkedList<>();
    private final List<Worker> workers = List.of(
            new Worker("Петрович"),
            new Worker("Михалыч"),
            new Worker("Андреич"));

    public void planeArrival(FlightNumbers flightNumbers) {
        for (int i = 0; i < 20; i++) {
            suitcases.add(new Suitcase(flightNumbers));
        }
    }

    public void unload() {
        //разгружать до тех пор, пока список не станет пустым(если пустой, то true)
        while (!suitcases.isEmpty()) {
            unloadHelper();
        }
    }

    private void unloadHelper() {
        for (Worker worker : workers) {
            worker.throwLuggage(suitcases);
            if (suitcases.isEmpty()) {
                return;
            }
        }
    }
}
