package com.example.superherov4.dto;

public class PowerNameDTO {
    private String heroName;
    private String superpower;

    public PowerNameDTO(String heroName, String superpower){
        this.heroName = heroName;
        this.superpower = superpower;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getSuperpower() {
        return superpower;
    }

    public void setSuperpower(String superpower) {
        this.superpower = superpower;
    }
}
