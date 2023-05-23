package DAO;

import Model.Car;

import java.util.List;

public interface CarDAO {
    List<Car> carlist(int count);
}
