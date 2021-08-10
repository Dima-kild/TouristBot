package com.example.touristbot.mapper;

import com.example.touristbot.dto.CityDto;
import com.example.touristbot.entity.City;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface CityMapper {

    CityDto toDto(City city);

    @Mapping(target = "id", ignore = true)
    City fromDto(CityDto cityDto);

    @InheritConfiguration
    City fillFromDto(CityDto cityDto, @MappingTarget City city);
}
