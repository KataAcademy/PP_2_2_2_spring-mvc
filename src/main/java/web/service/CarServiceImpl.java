package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


@Service
public class CarServiceImpl implements CarService {
    private static List<Car> cars;

    public List<Car> getCars(int count) {
        cars = new ArrayList<>();
        cars.add(new Car(1, "Volga", "Kupe"));
        cars.add(new Car(2, "Shkoda", "Universal"));
        cars.add(new Car(3, "Lada", "Povozka"));
        cars.add(new Car(4, "Ladaqq", "Povozkaqq"));
        cars.add(new Car(5, "Ladach", "Povozkach"));

        if (count > cars.size() | count < 0) {
            count = cars.size();
        }

        return cars.stream().limit(count).toList();

    }
}
