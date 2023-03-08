package com.example.superherov4.service;

import com.example.superherov4.dto.CityHeroDTO;
import com.example.superherov4.dto.GetHeroNameDTO;
import com.example.superherov4.model.Superhero;
import com.example.superherov4.repository.SuperheroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuperheroService {

    private final SuperheroRepository repository;

    public SuperheroService(SuperheroRepository superhero) {
        this.repository = superhero;
    }

    public List<Superhero> getSuperheros() {
        return repository.getSuperhero();
    }

    public List<CityHeroDTO> getNameAndCity(){
        return repository.getSuperheroNameAndCity();
    }
    public CityHeroDTO getCityByName(String superheroName){
        return repository.getCityByName(superheroName);
    }

    public List<GetHeroNameDTO> getNameRealCreation(){
        return repository.getNameRealCreation();
    }

    public GetHeroNameDTO getSuperhero(String superheroName){
        return repository.getsuperheroByName(superheroName);
    }


}
