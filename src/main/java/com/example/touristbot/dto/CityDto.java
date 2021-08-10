package com.example.touristbot.dto;

public class CityDto {
    private Integer id;
    private String name;
    private String info;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public CityDto() {
    }

    public CityDto(Integer id, String name, String info) {
        this.id = id;
        this.name = name;
        this.info = info;
    }
}
