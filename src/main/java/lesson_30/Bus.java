package lesson_30;

public class Bus extends Transport{
    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }
    @Override
    public String toString() {
        return "Bus: "+super.toString();
    }
}
