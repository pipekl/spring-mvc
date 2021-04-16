package web.dao;

import web.model.Car;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDao {
    private List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car("BMW", "745", 90));
        cars.add(new Car("VAZ", "2109", 200));
        cars.add(new Car("Renault", "Logan", 240));
        cars.add(new Car("Ferrari", "F40", 180));
        cars.add(new Car("GAZ", "3110", 235));
    }

    public List<Car> carsCount (int count) {
        if (count < 1 || count > 5) {
            return cars;
        } else {
            return cars.stream().limit(count).collect(Collectors.toList());
        }
    }

}
