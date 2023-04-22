package web.service;


import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImp implements CarService {
    private static int CARS_COUNT;

    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(++CARS_COUNT, "Car1", 1111));
        cars.add(new Car(++CARS_COUNT, "Car2", 2222));
        cars.add(new Car(++CARS_COUNT, "Car3", 3333));
        cars.add(new Car(++CARS_COUNT, "Car4", 4444));
        cars.add(new Car(++CARS_COUNT, "Car5", 5555));
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
