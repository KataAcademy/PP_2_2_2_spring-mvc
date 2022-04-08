package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import web.model.Car;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
public class CarDaoImp implements CarDao{

    @Autowired
    private List<Car> cars;


    @Override
    public List<Car> listCars(int i) {
        if (i <= 0) {
            return cars;
        }
        return cars.stream().limit(i).toList();
    }
}
