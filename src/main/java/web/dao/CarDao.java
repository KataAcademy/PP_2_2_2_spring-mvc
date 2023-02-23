package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDao {

    List<Car> getCars();

    List<Car> getCars(int count);
}