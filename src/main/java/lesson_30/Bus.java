package lesson_30;

import org.springframework.stereotype.Component;

@Component
public class Bus extends Transport{
    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }
    @Override
    public String toString() {
        return "Bus: "+super.toString();
    }
    @Override
    protected void printMessage() {
        System.out.println("<Bus> готов к работе");
    }
}
