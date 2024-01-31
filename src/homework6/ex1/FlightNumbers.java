package homework6.ex1;
//Создать раннер, в нем багажное отделение. Организовать два прилета SU-077, AO-222.
//Разгрузить багажное отделение. Сначала должны выйти чемоданы su-077, потом ao-222.
public enum FlightNumbers {
    SU_077("SU-077"), AO_222("AO-222");

    private String flightNumber;

    FlightNumbers(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    @Override
    public String toString() {
        return  flightNumber;
    }

    public String getFlightNumber() {
        return flightNumber;
    }
}
