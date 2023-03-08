package com.example.superherov4.dto;

import com.example.superherov4.model.Superhero;

import java.util.List;

public class SuperheroNameCityDTO {
    private String cityName;
    private List<GetHeroNameDTO> hero;


    public SuperheroNameCityDTO(String cityName, List hero){
        this.cityName = cityName;
        this.hero = hero;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public List<GetHeroNameDTO> getHero() {
        return hero;
    }

    public void setHero(List<GetHeroNameDTO> hero) {
        this.hero = hero;
    }
}
