package web.models;

public class Car {
    int id;
    String color;
    String carModel;

    public Car(int id, String color, String carModel) {
        this.id = id;
        this.color = color;
        this.carModel = carModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setEngine(int id) {
        this.id = id;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setSeries(String carModel) {
        this.carModel = carModel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", carModel='" + carModel + '\'' +
                '}';
    }
}
