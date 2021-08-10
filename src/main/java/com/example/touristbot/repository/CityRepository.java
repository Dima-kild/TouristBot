package com.example.touristbot.repository;

import com.example.touristbot.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CityRepository extends JpaRepository<City, Integer> {


    Optional<City> findByNameIgnoreCase(String cityName);
}
