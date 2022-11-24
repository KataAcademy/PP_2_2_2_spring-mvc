package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    @Override
    public List<Car> listCarsFirst(Integer count) {
        List<Car> carsList = Car.getCarList();
        int realCount = ((count == null) || (count < 1) || (count > carsList.size())) ? carsList.size() : count;
        return carsList.subList(0, realCount);
    }
}
