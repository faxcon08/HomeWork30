package lesson_30;

import org.springframework.beans.factory.annotation.Autowired;

public class Driver {
    private String name;
    @Autowired
    private Transport transport;

    public Driver(String name) {
        this.name=name;
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
