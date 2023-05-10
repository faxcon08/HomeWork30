package lesson_30;

public class Car extends Transport{
    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public String toString() {
        return "Car: "+super.toString();
    }
}
