package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDao {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Daewo", 2005, 110));
        cars.add(new Car("Mercedes C-class", 2022, 290));
        cars.add(new Car("Lada Priora", 2014, 180));
        cars.add(new Car("Bentley", 2021, 320));
        cars.add(new Car("Niva 4x4", 1983, 140));
    }

    public List<Car> model() {
        return cars;
    }

    public Car show(int maxSpeed) {
        return cars.stream().filter(car ->
                car.getMaxSpeed() == maxSpeed).findAny().orElse(null);
    }
}
