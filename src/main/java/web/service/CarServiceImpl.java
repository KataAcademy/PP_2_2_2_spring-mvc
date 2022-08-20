package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private static List<Car> cars;

    public List<Car> getCars(int count) {
        cars = new ArrayList<>();
        cars.add(new Car(1, "Volga", "Kupe"));
        cars.add(new Car(2, "Shkoda", "Universal"));
        cars.add(new Car(3, "Lada", "Povozka"));
        cars.add(new Car(4, "Ladaqq", "Povozkaqq"));
        cars.add(new Car(5, "Ladach", "Povozkach"));

        return cars.stream().limit(count).toList();

    }
}
