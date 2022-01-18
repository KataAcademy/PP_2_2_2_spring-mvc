package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> carList;

    {

        carList = new ArrayList<>();
        carList.add(new Car("BMW", 7, "black"));
        carList.add(new Car("Audi", 80, "white"));
        carList.add(new Car("Mersedes", 777, "metallic"));
        carList.add(new Car("Mazda", 6, "red"));
        carList.add(new Car("Lada Vesta", 15, "blue"));

    }

    @Override
    public List<Car> getCars(Integer count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
