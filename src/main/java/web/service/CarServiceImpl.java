package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService{
    private List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car(1, "greenKefteme", "AudiA6"));
        cars.add(new Car(2, "pinkCloud", "BMWX5"));
        cars.add(new Car(3, "blueSea", "ChetyrkaBystraya"));
        cars.add(new Car(4, "redAlert", "UAZik"));
        cars.add(new Car(5, "bakLazhan", "VAZ2106"));
    }
    public int getCarCount() {
        return cars.size();
    }

    public List<Car> getListOfCars(int count) {
        return cars.stream().limit(count).toList();
    }
}
