package week3.chapter14.modify.service;

import org.springframework.stereotype.Service;
import week3.chapter14.modify.model.Car;
import week3.chapter14.modify.repository.CarRepository;

import java.util.List;

@Service
public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Car createCar(Car car) {
        return carRepository.save(car);
    }

    public List<Car> getCars() {
        return carRepository.findAll();
    }

    public void updateCarColorById(Integer id, String color) {
        carRepository.updateColorById(color, id);
    }
}
