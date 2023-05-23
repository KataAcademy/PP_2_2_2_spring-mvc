package Service;

import DAO.CarDAO;
import Model.Car;


import java.util.List;

public class CarServiceImp implements CarService {
    CarDAO carDAO;
    @Override
    public List<Car> carList(int count) {
        return carDAO.carlist(count);
    }
}
