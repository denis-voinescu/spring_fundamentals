import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import week3.chapter14.modify.model.Car;
import week3.chapter14.modify.repository.CarRepository;
import week3.chapter14.modify.service.CarService;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class Chapter15Tests {

    @Mock
    private CarRepository carRepository;

    @InjectMocks
    private CarService carService;

    @Test
    public void testGetCars() {

        List<Car> cars = carService.getCars();
        assertNotNull(cars);

    }

    @Test
    public void testCreateCar() {

        Car car = new Car();
        car.setColor("Red");

        when(carRepository.save(car)).thenReturn(car);

        Car createdCar = carService.createCar(car);

        assertNotNull(createdCar);
        assertEquals("Red", createdCar.getColor());

    }

    @Test
    public void testUpdateCarColorById() {

        Integer carId = 1;
        String newColor = "Blue";

        carService.updateCarColorById(carId, newColor);

    }



}
