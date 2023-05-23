package Model;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Car {
    private String model;
    private String color;
    private int serial;

    public Car(String model, String color, int serial) {
        this.model = model;
        this.color = color;
        this.serial = serial;
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", serial=" + serial +
                '}';
    }
}
