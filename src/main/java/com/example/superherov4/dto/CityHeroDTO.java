package com.example.superherov4.dto;

public class CityHeroDTO {
    private String heroName;
    private String cityName;


    public CityHeroDTO(String heroName, String cityName){
        this.heroName = heroName;
        this.cityName = cityName;
    }

    public String getHeroName() {
        return heroName;
    }

    public String getCityName() {
        return cityName;
    }
}
