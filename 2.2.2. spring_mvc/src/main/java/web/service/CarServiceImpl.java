package web.service;

import web.dao.CarDao;
import web.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CarServiceImpl {
    @Autowired
    private CarDao carDao;

    public List<Car> carsCount(int count) {
        return carDao.carsCount(count);
    }
}
