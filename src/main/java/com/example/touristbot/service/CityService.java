package com.example.touristbot.service;

import com.example.touristbot.dto.CityDto;

import java.util.List;
import java.util.Optional;

public interface CityService {

    List<CityDto> getAll();

    CityDto createCity(CityDto cityDto);

    CityDto updateCity(Integer id, CityDto cityDto);

    void deleteCity(Integer id);

    Optional<CityDto> findByName(String cityName);
}
