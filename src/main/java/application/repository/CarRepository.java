package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import application.model.Car;
@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

}
