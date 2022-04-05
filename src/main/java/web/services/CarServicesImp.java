package web.services;

import web.dao.CarDao;
import web.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CarServicesImp implements CarServices{

    private final CarDao carDao;

    @Autowired
    public CarServicesImp(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public void createCar(String model, int series, int age) {
        carDao.createCar(model, series, age);
    }

    @Override
    public void createListOfCars(int i) {
        carDao.createListOfCars(i);
    }

    @Override
    public List<Car> listCars(int i) {
        return carDao.listCars(i);
    }
}
