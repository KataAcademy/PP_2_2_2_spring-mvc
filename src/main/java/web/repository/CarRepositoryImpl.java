package web.repository;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarRepositoryImpl implements CarRepository {

    private static final List<Car> cars;

    static {
        cars = new ArrayList<>() {{
            add(new Car(1L, "Mercedes", 600));
            add(new Car(2L, "BMV", 5));
            add(new Car(3L, "Lada", 99));
            add(new Car(4L, "Moscvich", 24));
            add(new Car(5L, "Volvo", 90));
        }};
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }

    @Override
    public List<Car> getCarsCount(Integer count) {
        if (count == null) {
            return getCars();
        }
        if (count >= getCars().size() || count < 0) {
            return getCars();
        }
        return getCars().subList(0, count);
    }
}
