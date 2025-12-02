package week3.chapter13.transactions.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import week3.chapter13.transactions.model.Car;
import week3.chapter13.transactions.repository.CarRepository;

import java.util.List;

@Service
public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

//    @Transactional
    public Car createCar(Car car) {
        carRepository.save(car);
        throw new RuntimeException("Simulated exception to test transaction rollback");
        // The above line will make sure that the car is not being saved to the database
        // because an exception was thrown and the transaction is rolled back
        // if the @Transactional annotation is removed or commented, the car is saved despite the exception
//        return car;
    }

    public List<Car> getCars() {
        return carRepository.findAll();
    }
}
