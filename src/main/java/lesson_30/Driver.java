package lesson_30;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Driver {
    private String name;

    private Transport transport;
    @Autowired
    public Driver(String name,@Qualifier("callCar") Car ts1) {
        this.name=name;
        this.transport=ts1;
    }
    @Autowired
    public Driver(String name,@Qualifier("callBus") Bus ts2) {
        this.name=name;
        this.transport=ts2;
    }
    @Autowired
    public Driver(String name,@Qualifier("callPickup") Pickup ts3) {
        this.name=name;
        this.transport=ts3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    @Override
    public String toString() {
        return "Driver [ "+name+" ] with "+transport;
    }
}
