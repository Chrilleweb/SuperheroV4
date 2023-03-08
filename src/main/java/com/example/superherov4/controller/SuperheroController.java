package com.example.superherov4.controller;

import com.example.superherov4.dto.CityHeroDTO;
import com.example.superherov4.dto.GetHeroNameDTO;
import com.example.superherov4.dto.SuperheroNameCityDTO;
import com.example.superherov4.model.Superhero;
import com.example.superherov4.service.SuperheroService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "kea") //localhost:8082/kea
public class SuperheroController {

    private final SuperheroService superheroService;


    public SuperheroController(SuperheroService superheroService) {
        this.superheroService = superheroService;

    }

//printer alle superheroes ud
    @GetMapping(path = "superhero") //localhost:8082/kea/superhero
    public ResponseEntity<List<Superhero>> getSuperheroes() {
        List<Superhero> superheroList = superheroService.getSuperheros();

        return new ResponseEntity<List<Superhero>>(superheroList, HttpStatus.OK);
    }

    //printer alle superheroes ud med navn og by
    @GetMapping(path = "city") //localhost:8082/kea/city
    public ResponseEntity<List<CityHeroDTO>> getSuperheroNameAndCity() {
        List<CityHeroDTO> cityHeroDTOList = superheroService.getNameAndCity();

        return new ResponseEntity<List<CityHeroDTO>>(cityHeroDTOList, HttpStatus.OK);
    }

    @GetMapping(path = "city/{name}") //localhost:8082/kea/city/name
    public ResponseEntity<CityHeroDTO> getCityByName(@PathVariable String name) {
        CityHeroDTO cityHeroDTO = superheroService.getCityByName(name);

        return new ResponseEntity<CityHeroDTO>(cityHeroDTO, HttpStatus.OK);
    }

    @GetMapping(path = "superheroNRC") //localhost:8082/kea/superheroNRC
    public ResponseEntity<List<GetHeroNameDTO>> getNameRealCreation() {
        List<GetHeroNameDTO> getHeroNameDTOList = superheroService.getNameRealCreation();

        return new ResponseEntity<List<GetHeroNameDTO>>(getHeroNameDTOList, HttpStatus.OK);
    }

    @GetMapping(path = "superheroNRC/{name}") //localhost:8082/kea/superheroNRC
    public ResponseEntity<GetHeroNameDTO> getNameRealCreation(@PathVariable String name) {
        GetHeroNameDTO getHeroNameDTOList = superheroService.getSuperhero(name);

        return new ResponseEntity<GetHeroNameDTO>(getHeroNameDTOList, HttpStatus.OK);
    }











}

