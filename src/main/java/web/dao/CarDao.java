package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDao {
    void createCar(String model, int series, int age);
    void createListOfCars(int i);
    List<Car> listCars(int i);

}
