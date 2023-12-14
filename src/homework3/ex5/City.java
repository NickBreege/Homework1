package homework3.ex5;

import java.util.Arrays;

public final class City {
    private final String city;
    private final House[] arrayHouse;

    public City(String city, House[] arrayHouse) {
        this.city = city;
        this.arrayHouse = arrayHouse;
    }

    public String getCity() {
        return city;
    }

    public House[] getArrayHouse() {
        return arrayHouse;
    }

    @Override
    public String toString() {
        return "Город: " + city
                + ", массив домов " + Arrays.toString(arrayHouse);
    }
}
