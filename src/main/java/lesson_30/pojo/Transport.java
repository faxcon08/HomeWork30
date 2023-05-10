package lesson_30.pojo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
@Component
abstract public class Transport {
    private  String brand;
    private  String model;
    private  double engineVolume;

    public Transport(String brand, String model, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
    }
    @Override
    public String toString() {
        return String.format("Brand[%1$s], Model[%2$s], EngineVolume[%3$.1f]", brand, model, engineVolume);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setBrand(String brand) {
        this.brand=brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    @PostConstruct
    protected void printMessage() {
        System.out.println(this.getClass()+" готов к работе");
    }
}
