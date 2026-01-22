package web.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import web.model.Car;

import javax.annotation.PostConstruct;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class CarRepository {

    private final JdbcTemplate jdbcTemplate;

    public CarRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @PostConstruct
    public void init() {
        jdbcTemplate.execute("""
        CREATE TABLE IF NOT EXISTS cars (
            id BIGINT AUTO_INCREMENT PRIMARY KEY,
            brand VARCHAR(100) NOT NULL,
            model VARCHAR(100) NOT NULL,
            manufacture_year INT NOT NULL
        )
    """);

        Integer count = jdbcTemplate.queryForObject(
                "SELECT COUNT(*) FROM cars",
                Integer.class
        );

        if (count != null && count == 0) {
            jdbcTemplate.update(
                    "INSERT INTO cars (brand, model, manufacture_year) VALUES (?, ?, ?)",
                    "Toyota", "Camry", 2018
            );
            jdbcTemplate.update(
                    "INSERT INTO cars (brand, model, manufacture_year) VALUES (?, ?, ?)",
                    "BMW", "X5", 2020
            );
            jdbcTemplate.update(
                    "INSERT INTO cars (brand, model, manufacture_year) VALUES (?, ?, ?)",
                    "Kia", "Rio", 2017
            );
            jdbcTemplate.update(
                    "INSERT INTO cars (brand, model, manufacture_year) VALUES (?, ?, ?)",
                    "Mercedes-Benz", "C200", 2019
            );
            jdbcTemplate.update(
                    "INSERT INTO cars (brand, model, manufacture_year) VALUES (?, ?, ?)",
                    "Skoda", "Octavia", 2021
            );
        }
    }

    public List<Car> findAll() {
        return jdbcTemplate.query(
                "SELECT id, brand, model, manufacture_year FROM cars ORDER BY id",
                this::mapRow
        );
    }

    public List<Car> findFirst(int limit) {
        return jdbcTemplate.query(
                "SELECT id, brand, model, manufacture_year FROM cars ORDER BY id LIMIT ?",
                this::mapRow,
                limit
        );
    }

    public void save(Car car) {
        jdbcTemplate.update(
                "INSERT INTO cars (brand, model, manufacture_year) VALUES (?, ?, ?)",
                car.getBrand(),
                car.getModel(),
                car.getYear()
        );
    }

    private Car mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Car(
                rs.getLong("id"),
                rs.getString("brand"),
                rs.getString("model"),
                rs.getInt("manufacture_year")
        );
    }
}
