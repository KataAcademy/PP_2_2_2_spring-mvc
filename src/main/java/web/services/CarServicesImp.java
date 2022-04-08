package web.services;

import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

@Service
public class CarServicesImp implements CarServices{

    private final CarDao carDao;

    @Autowired
    public CarServicesImp(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> listCars(int i) {
        return carDao.listCars(i);
    }
}
