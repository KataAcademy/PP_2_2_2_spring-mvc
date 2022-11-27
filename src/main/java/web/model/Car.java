package web.model;

public class Car {

    private String carBrand;
    private String carModel;
    private int carCost;
    private int count = 1;

    public Car() {

    }

    public Car(String carBrand, String carModel, int carCost) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carCost = carCost;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public int getCarCost() {
        return carCost;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setCarCost(int carCost) {
        this.carCost = carCost;
    }
}
