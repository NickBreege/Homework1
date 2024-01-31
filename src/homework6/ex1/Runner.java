package homework6.ex1;

import java.util.LinkedList;
import java.util.Queue;

import static homework6.ex1.FlightNumbers.AO_222;
import static homework6.ex1.FlightNumbers.SU_077;

public class Runner {
    public static void main(String[] args) {
        Queue<Suitcase> suitcases = new LinkedList<>();
        Worker[] workers = {new Worker("Петрович"), new Worker("Борисыч"), new Worker("Михалыч")};
        LuggageSpace luggageSpace = new LuggageSpace(suitcases, workers);
        luggageSpace.planeArrival(SU_077);
        luggageSpace.planeArrival(AO_222);
        luggageSpace.unload();
    }
}