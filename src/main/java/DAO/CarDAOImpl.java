package DAO;

import Model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDAOImpl implements CarDAO {
    private List<Car> carList = new ArrayList<>();


    public List<Car> fullCarList() {
        for (int i = 1; i <= 5; i++) {
            carList.add(new Car("Model" + i, "Color" + i, i));
        }
        return carList;
    }




    @Override
    public List<Car> carlist(int count) {
        if (count < 5) {
            return fullCarList().stream().limit(count).toList();
        } else {
            return fullCarList();
        }
    }



}
