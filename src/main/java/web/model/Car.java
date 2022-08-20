package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private long id;
    private String marka;
    private String forma;


    public Car(int id, String marka, String forma) {
        this.id = id;
        this.marka = marka;
        this.forma = forma;
    }

    public long getId() {
        return id;
    }


    public String getMarka() {
        return marka;
    }


    public String getForma() {
        return forma;
    }


    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", marka='" + marka + '\'' +
                ", forma='" + forma + '\'' +
                '}';
    }
}
