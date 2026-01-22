package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import web.model.CarCreateRequest;
import web.repository.CarRepository;

import java.util.List;

@Service
public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> list(Integer count) {
        if (count == null) {
            return carRepository.findAll();
        }
        if (count <= 0) {
            return List.of();
        }
        return carRepository.findFirst(count);
    }

    public void add(CarCreateRequest req) {
        carRepository.save(new Car(null, req.getBrand(), req.getModel(), req.getYear()));
    }
}