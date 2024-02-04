package homework6.ex1;

public class Suitcase {
    private FlightNumbers flightNumber;

    public Suitcase(FlightNumbers flightNumber) {
        this.flightNumber = flightNumber;
    }

    @Override
    public String toString() {
        return "№ " + flightNumber;
    }

    public FlightNumbers getFlightNumber() {
        return flightNumber;
    }
}
