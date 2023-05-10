package lesson_30.config;

import lesson_30.pojo.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean(name="callCar")
    @Scope("singleton")
    public Transport getCarBean() {
        return new Car("BMW","X5",3);
    }
    @Bean(name="callBus")
    @Scope("singleton")
    public Transport getBusBean() {
        return new Bus("Volvo", "7900", 4);
    }
    @Bean(name = "callPickup")
    @Scope("singleton")
    public Transport getPickupBean() {
        return new Pickup("KAMAZ","6511",5);
    }
    @Bean(name="callCarDriver")
    public Driver getCarDriver() {
        return new Driver("CarDriver", (Car) getCarBean());
    }
    @Bean(name="callBusDriver")
    public Driver getBusDriver() {
        return new Driver("BusDriver", (Bus) getBusBean());
    }
    @Bean(name="callPickupDriver")
    public Driver getPickupDriver() {
        return new Driver("PickupDriver", (Pickup) getPickupBean());
    }
}
