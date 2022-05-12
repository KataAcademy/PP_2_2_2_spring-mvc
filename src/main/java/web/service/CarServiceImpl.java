package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;
import web.repository.CarRepository;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    @Autowired
    private CarRepository carRepository;

    @Override
    public List<Car> getCars() {
        return carRepository.getCars();
    }

    @Override
    public List<Car> getCarsCount(Integer count) {
        return carRepository.getCarsCount(count);
    }
}
