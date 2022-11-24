package web.model;


import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;
    private int year;
    private int maxSpeed;

    public Car(String model, int year, int maxSpeed) {
        this.model = model;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car model: " + model + "\n" +
                ", year of  manufacture: " + year + "\n" +
                ", maximum speed: " + maxSpeed + "\n";
    }
    public static List<Car> getCarList(){
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Daewoo Matiz", 2005, 144));
        carList.add(new Car("Mercedes C-class", 2022, 290));
        carList.add(new Car("Lada Priora", 2014, 190));
        carList.add(new Car("Bentley Continental GT", 2021, 335));
        carList.add(new Car("Niva 4x4", 1983, 137));
        return carList;
    }

}
