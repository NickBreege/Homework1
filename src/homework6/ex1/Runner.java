package homework6.ex1;

import static homework6.ex1.FlightNumbers.AO_222;
import static homework6.ex1.FlightNumbers.SU_077;

public class Runner {
    public static void main(String[] args) {
        LuggageDepartment luggageDepartment = new LuggageDepartment();
        luggageDepartment.planeArrival(SU_077);
        luggageDepartment.planeArrival(AO_222);
        luggageDepartment.unload();
    }
}
