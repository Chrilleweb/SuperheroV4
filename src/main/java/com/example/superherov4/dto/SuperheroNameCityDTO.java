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


}
