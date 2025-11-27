package week3.chapter14.modify.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import week3.chapter14.modify.model.Car;
import week3.chapter14.modify.service.CarService;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("api/v1/cars")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public List<Car> getCars() {
        return carService.getCars();
    }

    @PostMapping
    public ResponseEntity<Car> createCar(@RequestBody Car car) {
        carService.createCar(car);
        return ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Car> updateCarColorById(@PathVariable Integer id, @RequestBody Car car) {
        carService.updateCarColorById(id, car.getColor());
        return ok().build();
    }
}
