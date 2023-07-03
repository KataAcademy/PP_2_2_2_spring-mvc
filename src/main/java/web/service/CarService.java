package web.service;

import web.models.Car;

import java.util.List;

public interface CarService {
    public int getCarCount();
    public List<Car> getListOfCars(int count);
}
