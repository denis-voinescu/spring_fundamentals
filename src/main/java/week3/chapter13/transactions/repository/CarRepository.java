package week3.chapter13.transactions.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import week3.chapter13.transactions.model.Car;

public interface CarRepository extends JpaRepository<Car, Integer> {
}
