package com.example.superherov4.model;

public class Superhero {
    private String superHeroName;
    private String reelName;
    private int creationYear;
    private String superPower;
    private String cityName;

    //konstruktør
    public Superhero(String superHeroName, String reelName, String superPower, int creationYear, String cityName) {
        this.superHeroName = superHeroName;
        this.reelName = reelName;
        this.superPower = superPower;
        this.creationYear = creationYear;
        this.cityName = cityName;
    }

    public Superhero(String superHeroName, String cityName){
        this.superHeroName = superHeroName;
        this.cityName = cityName;
    }


    //Gettere
    public String getSuperHeroName() {
        return superHeroName;
    }
    public String getReelName() {
        return reelName;
    }
    public String getSuperPower() {
        return superPower;
    }
    public int getCreationYear() {
        return creationYear;
    }
    public String getCity() {
        return cityName;
    }
    public String toString() {
        return getSuperHeroName() + ", " + getSuperPower() + ", " + getReelName() + ", " + getCreationYear() + " " + getCity();
    }

}

