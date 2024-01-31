package homework7.ex5;

public class Runner {
    public static void main(String[] args) {
        Ruler<Boat> boatRuler = Boat::getLength;
        Ruler<Animal> animalRuler = animal -> animal.getBodyLength() + animal.getTailLength();

        int measureBoat = boatRuler.measure(new Boat(200));
        int measureAnimal = animalRuler.measure(new Animal(50, 20));
        System.out.println(measureBoat);
        System.out.println(measureAnimal);
    }
}