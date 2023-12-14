package homework3.ex5;

public class House {
    private String street;
    private int numberHouse;

    public House(String street, int numberHouse) {
        this.street = street;
        this.numberHouse = numberHouse;
    }

    @Override
    public String toString() {
        return "улица: " + street
                + ", дом " + numberHouse;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumberHouse() {
        return numberHouse;
    }

    public void setNumberHouse(int numberHouse) {
        this.numberHouse = numberHouse;
    }
}
