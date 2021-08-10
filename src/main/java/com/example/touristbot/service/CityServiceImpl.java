package com.example.touristbot.service;

import com.example.touristbot.dto.CityDto;
import com.example.touristbot.entity.City;
import com.example.touristbot.mapper.CityMapper;
import com.example.touristbot.repository.CityRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class CityServiceImpl implements CityService {

    private final CityRepository cityRepository;
    private final CityMapper cityMapper;

    public CityServiceImpl(CityRepository cityRepository, CityMapper cityMapper) {
        this.cityRepository = cityRepository;
        this.cityMapper = cityMapper;
    }

    @Override
    public List<CityDto> getAll() {
        return cityRepository.findAll().stream()
                .map(cityMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public CityDto createCity(CityDto cityDto) {
        City city = cityMapper.fromDto(cityDto);
        return cityMapper.toDto(cityRepository.save(city));
    }

    @Override
    public CityDto updateCity(Integer id, CityDto cityDto) {
        return cityRepository.findById(id)
                .map((city) -> cityMapper.fillFromDto(cityDto, city))
                .map(cityMapper::toDto)
                .orElseThrow(() -> new RuntimeException("City not found"));

    }

    @Override
    public void deleteCity(Integer id) {
        City city = cityRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("City not found"));
        cityRepository.delete(city);
    }

    @Override
    public Optional<CityDto> findByName(String cityName) {
        return cityRepository.findByNameIgnoreCase(cityName)
                .map(cityMapper::toDto);
    }
}
