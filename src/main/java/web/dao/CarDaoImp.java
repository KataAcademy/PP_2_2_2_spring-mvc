package web.dao;

import web.model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImp implements CarDao{

    private List<Car> cars = new ArrayList<>();

    @Override
    public void createCar(String model, int series, int age) {
        cars.add(new Car(model, series, age));
    }

    @Override
    public void createListOfCars(int i) {
        for (int j = 0; j < i; j++) {
            createCar("default_model " + (j + 1), j + 1, 5);
        }
    }

    @Override
    public List<Car> listCars(int i) {
        if (i <= 0) {
            return cars;
        }
        return cars.stream().limit(i).toList();
    }
}
