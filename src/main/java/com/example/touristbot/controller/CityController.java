package com.example.touristbot.controller;

import com.example.touristbot.dto.CityDto;
import com.example.touristbot.service.CityService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/cities",
        produces = MediaType.APPLICATION_JSON_VALUE,
        consumes = MediaType.ALL_VALUE)
public class CityController {

    private final CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping
    public List<CityDto> getAll() {
        return cityService.getAll();
    }

    @PostMapping
    public CityDto createCity(@RequestBody CityDto cityDto) {
        return cityService.createCity(cityDto);
    }

    @PutMapping("/{id}")
    public CityDto updateCity(@PathVariable("id") Integer id, @RequestBody CityDto cityDto) {
        return cityService.updateCity(id, cityDto);
    }

    @DeleteMapping("/{id}")
    public void deleteCity(@PathVariable("id") Integer id) {
    cityService.deleteCity(id);
    }
}
