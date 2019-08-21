package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    CarRepository repository;

    @Override
    public void run(String ... strings) throws Exception {
        Car car;
        car = new Car("Bugatti", "LaVoiture Noire", "2019");
        repository.save(car);

        car = new Car("Ferrari", "250 GTO", "1962");
        repository.save(car);

        car = new Car("Porche", "911 GT2 RS", "2018");
        repository.save(car);

        car = new Car("Koenigsegg", "Jesko", "2019");
        repository.save(car);
    }
}

