package homework4.ex1;

public class Runner {
    public static void main(String[] args) {
        Car car = new Car(5, 2, 1.8, false, true);
        Car car1 = new Car(5, 2, 1.8, false, true);
        Car car2 = new Car(5, 2, 1.8, false, true);
        Car car3 = new Car(5, 2, 1.8, false, true);

        Bus bus = new Bus(12, 3, 2.3, false, 30);
        Bus bus1 = new Bus(12, 3, 2.3, false, 30);
        Bus bus2 = new Bus(12, 3, 2.3, false, 30);
        Bus bus3 = new Bus(12, 3, 2.3, false, 30);
        Bus bus4 = new Bus(12, 3, 2.3, false, 30);

        CarWash carWash = new CarWash();
        Automobile[] automobiles = {car, car1, car2, car3, bus, bus1, bus2, bus3, bus4};
        System.out.println(carWash.wash(automobiles));
    }
}
