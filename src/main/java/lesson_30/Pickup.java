package lesson_30;

import org.springframework.stereotype.Component;

@Component
public class Pickup extends Transport{
    public Pickup(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }
    @Override
    public String toString() {
        return "Pickup: "+super.toString();
    }
    @Override
    protected void printMessage() {
        System.out.println("<Pickup> готов к работе");
    }
}
