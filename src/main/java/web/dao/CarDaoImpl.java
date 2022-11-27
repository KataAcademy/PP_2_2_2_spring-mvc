package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {

    private final List<Car> cars;

    public CarDaoImpl(List<Car> cars) {
        this.cars = cars;
    }


    @Override
    public List<Car> listCars(int i) {
        if (i <= 0) {
            return cars;
        }
        return cars.stream().limit(i).toList();
    }
}
