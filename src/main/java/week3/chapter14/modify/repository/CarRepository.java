package week3.chapter14.modify.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import week3.chapter14.modify.model.Car;

public interface CarRepository extends JpaRepository<Car, Integer> {

    @Transactional
    @Modifying
    @Query("UPDATE Car c SET c.color =:color WHERE c.id =:id")
    void updateColorById(@Param("color") String color, @Param("id") Integer id);

}
