package web.repository;

import web.model.Car;

import java.util.List;

public interface CarRepository {
    List<Car> getCars();
    List<Car> getCarsCount(Integer count);
}
