package lesson_30.pojo;

import org.springframework.stereotype.Component;

@Component
public class Car extends Transport{
    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public String toString() {
        return "Car: "+super.toString();
    }

    @Override
    protected void printMessage() {
        System.out.println("<CAR> готов к работе");
    }
}
