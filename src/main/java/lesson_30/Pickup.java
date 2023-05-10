package lesson_30;

public class Pickup extends Transport{
    public Pickup(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }
    @Override
    public String toString() {
        return "Pickup: "+super.toString();
    }
}
