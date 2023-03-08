package com.example.superherov4.controller;

import com.example.superherov4.dto.CityHeroDTO;
import com.example.superherov4.dto.GetHeroNameDTO;
import com.example.superherov4.dto.PowerNameDTO;
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
    @GetMapping(path = "superhero") //localhost:8083/kea/superhero
    public ResponseEntity<List<Superhero>> getSuperheroes() {
        List<Superhero> superheroList = superheroService.getSuperheros();

        return new ResponseEntity<List<Superhero>>(superheroList, HttpStatus.OK);
    }

    //printer alle superheroes ud med navn og by
    @GetMapping(path = "city") //localhost:8083/kea/city
    public ResponseEntity<List<CityHeroDTO>> getSuperheroNameAndCity() {
        List<CityHeroDTO> cityHeroDTOList = superheroService.getNameAndCity();

        return new ResponseEntity<List<CityHeroDTO>>(cityHeroDTOList, HttpStatus.OK);
    }

    //printer superhelten ud med navn og by
    @GetMapping(path = "city/{name}") //localhost:8083/kea/city/name
    public ResponseEntity<CityHeroDTO> getCityByName(@PathVariable String name) {
        CityHeroDTO cityHeroDTO = superheroService.getCityByName(name);

        return new ResponseEntity<CityHeroDTO>(cityHeroDTO, HttpStatus.OK);
    }

    //printer alle superheroes med heroName, realName og creationYear
    @GetMapping(path = "superheroNRC") //localhost:8083/kea/superheroNRC
    public ResponseEntity<List<GetHeroNameDTO>> getNameRealCreation() {
        List<GetHeroNameDTO> getHeroNameDTOList = superheroService.getNameRealCreation();

        return new ResponseEntity<List<GetHeroNameDTO>>(getHeroNameDTOList, HttpStatus.OK);
    }

    //printer superhelten ud med heroName, realName og creationYear
    @GetMapping(path = "superheroNRC/{name}") //localhost:8083/kea/superheroNRC/name
    public ResponseEntity<GetHeroNameDTO> getNameRealCreation(@PathVariable String name) {
        GetHeroNameDTO getHeroNameDTOList = superheroService.getSuperhero(name);

        return new ResponseEntity<GetHeroNameDTO>(getHeroNameDTOList, HttpStatus.OK);
    }

    //printer superhelten ud med heroName og superpowerName
    @GetMapping(path = "power/{name}") //localhost:8083/kea/power/name
    public ResponseEntity<PowerNameDTO> getPowerByName(@PathVariable String name) {
        PowerNameDTO powerNameDTO = superheroService.getPowerByName(name);

        return new ResponseEntity<PowerNameDTO>(powerNameDTO, HttpStatus.OK);
    }











}

