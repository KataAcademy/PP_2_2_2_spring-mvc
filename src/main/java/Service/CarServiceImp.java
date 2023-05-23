package Service;

import DAO.CarDAO;
import DAO.CarDAOImpl;
import Model.Car;

import java.util.List;

public class CarServiceImp implements CarService {
    CarDAO carDAO;
    @Override
    public List<Car> carList(int amount) {
        return carDAO.carlist(amount);
    }
}
