package com.gabriellazar;

import com.gabriellazar.model.Car;
import com.gabriellazar.orm.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class ORMApplication {

    public static void main(String[] args) {
        SpringApplication.run(ORMApplication.class, args);
    }

    private CarRepository carRepository;

    @Autowired
    public ORMApplication(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @PostConstruct
    public void dataInit() {

        Car car = new Car("BMW", "M5");
        Car car1 = new Car("Toyota", "Camry");
        Car car2 = new Car("Mercedes", "S");

        carRepository.save(car);
        carRepository.save(car1);
        carRepository.save(car2);
    }

}
